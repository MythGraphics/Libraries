/*
 *
 */

package security;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.0
 *
 */

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Enumeration;
import javax.crypto.*;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Hba {

    public final static String HBA_SIG_ALIAS = "HBA_Signatur_Alias";
    public final static String HBA_ENC_ALIAS = "HBA_Enc_Alias";
    public final static String HBA_DEC_ALIAS = "HBA_Decryption_Alias";

    private final static String CONFIG_PATH  = "src\\security\\pkcs11.cfg";

    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test() throws IOException, NoSuchAlgorithmException, KeyStoreException, CertificateException {
        // PKCS#11 Provider initialisieren
        Provider provider = Security.getProvider("SunPKCS11");
        provider = provider.configure(CONFIG_PATH);
        Security.addProvider(provider);

        /* KeyStore der Smartcard (HBA) öffnen
         * Wenn null als Passwort übergeben, triggert das System (bzw. der Treiber)
         * in der Regel den PIN-Dialog auf dem Reiner SCT Display. */
        KeyStore keyStore = KeyStore.getInstance("PKCS11", provider);
        System.out.println("Bitte PIN am Kartenleser eingeben ...");
        keyStore.load(null, null);

        // Den passenden Alias (Schlüssel) für die Signatur finden
        Enumeration<String> aliases = keyStore.aliases();
        String alias = null;
        while ( aliases.hasMoreElements() ) {
            String currentAlias = aliases.nextElement();
            // HBAs haben oft mehrere Aliase (z.B. für Verschlüsselung vs. Signatur/QES)
            System.out.println("Gefundener Alias: " + currentAlias); // debug
            if ( currentAlias.toLowerCase().contains( "sign" )) {
                alias = currentAlias;
            }
        }
        if (alias == null) {
            throw new CertificateException("Kein passender Signaturschlüssel gefunden.");
        }

        System.out.println("Test erfolgreich.");
    }

    public static void sign(byte[] data)
        throws IOException, KeyStoreException, NoSuchAlgorithmException, CertificateException, UnrecoverableKeyException,
               InvalidKeyException, SignatureException {
        // PKCS#11 Provider initialisieren
        Provider provider = Security.getProvider("SunPKCS11").configure(CONFIG_PATH);
        Security.addProvider(provider);

        // KeyStore laden (PIN-Eingabe erfolgt am Terminal)
        KeyStore keyStore = KeyStore.getInstance("PKCS11", provider);
        keyStore.load(null, null);

        // richtigen Alias für Signatur finden ("sign" oder "qes" im Namen)
        String sigAlias = HBA_SIG_ALIAS;
        PrivateKey privateKeySig = (PrivateKey) keyStore.getKey(sigAlias, null);
        PublicKey publicKeySig = keyStore.getCertificate(sigAlias).getPublicKey();

        // signieren
        Signature signer = Signature.getInstance("SHA256withRSA", provider);
        signer.initSign(privateKeySig);
        signer.update(data);
        byte[] signatureBytes = signer.sign(); // Das ist die lose Signatur (Detached Signature)
        System.out.println("Signatur erfolgreich erstellt: Länge: " + signatureBytes.length + " Bytes."); // debug

        // verifizieren
        Signature verifier = Signature.getInstance("SHA256withRSA", provider);
        verifier.initVerify(publicKeySig);
        verifier.update(data);
        boolean isValid = verifier.verify(signatureBytes);

        System.out.println("Signatur ist gültig: " + isValid);
    }

    public static void encrypt(byte[] data, KeyStore keyStore, Provider provider)
        throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException,
               BadPaddingException, KeyStoreException {
        // symmetrischen AES-Schlüssel generieren
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256); // 256-Bit AES
        SecretKey aesKey = keyGen.generateKey();

        // Daten mit AES verschlüsseln
        Cipher aesCipher = Cipher.getInstance("AES/GCM/NoPadding"); // Sicherer GCM-Modus
        aesCipher.init(Cipher.ENCRYPT_MODE, aesKey);
        byte[] encryptedData = aesCipher.doFinal(data);
        byte[] iv = aesCipher.getIV(); // Initialisierungsvektor wird für GCM benötigt

        // AES-Schlüssel mit dem öffentlichen RSA-Key des HBAs verschlüsseln
        PublicKey hbaPublicKeyEnc = keyStore.getCertificate(HBA_ENC_ALIAS).getPublicKey();
        Cipher rsaCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding", provider);
        rsaCipher.init(Cipher.ENCRYPT_MODE, hbaPublicKeyEnc);
        byte[] encryptedAesKey = rsaCipher.doFinal( aesKey.getEncoded() );

        // Ergebnis: [encryptedData] + [encryptedAesKey] + [iv]
        System.out.println("encrypted data: " + Arrays.toString( encryptedData ));
        System.out.println("encrypted AES Key: " + Arrays.toString( encryptedAesKey ));
        System.out.println("Initialisierungsvektor: " + Arrays.toString( iv ));
    }

    public static void decrypt(byte[] encryptedData, byte[] encryptedAesKey, byte[] iv, KeyStore keyStore, Provider provider)
        throws InvalidKeyException, NoSuchAlgorithmException, KeyStoreException, BadPaddingException,
               IllegalBlockSizeException, UnrecoverableKeyException, InvalidAlgorithmParameterException,
               NoSuchPaddingException, UnsupportedEncodingException {
        // privaten Entschlüsselungs-Schlüssel vom HBA holen
        String encAlias = HBA_DEC_ALIAS; // Oft mit "enc" oder "dec" im Namen
        PrivateKey privateKeyEnc = (PrivateKey) keyStore.getKey(encAlias, null);

        // verschlüsselten AES-Schlüssel mit dem HBA entschlüsseln
        Cipher rsaDecryptCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding", provider);
        rsaDecryptCipher.init(Cipher.DECRYPT_MODE, privateKeyEnc);
        byte[] decryptedAesKeyBytes = rsaDecryptCipher.doFinal(encryptedAesKey);

        // AES-Schlüssel in Java rekonstruieren
        SecretKey reconstructedAesKey = new SecretKeySpec(decryptedAesKeyBytes, "AES");

        // eigentlichen Daten mit dem AES-Schlüssel entschlüsseln
        Cipher aesDecryptCipher = Cipher.getInstance("AES/GCM/NoPadding");
        GCMParameterSpec spec = new GCMParameterSpec(128, iv); // 128-bit Authentifizierungs-Tag
        aesDecryptCipher.init(Cipher.DECRYPT_MODE, reconstructedAesKey, spec);

        byte[] decryptedData = aesDecryptCipher.doFinal(encryptedData);

        System.out.println("Entschlüsselte Daten:");
        System.out.println( new String( decryptedData, "UTF-8" ));
    }

}