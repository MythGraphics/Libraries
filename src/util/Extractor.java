/*
 * Extractor.java
 *
 * Created on 20. September 2009, 04:10
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.0.3
 *
 */

import io.IO;
import java.io.IOException;
import java.util.jar.JarFile;
import java.util.zip.ZipFile;
import java.util.zip.ZipEntry;

public class Extractor {

    private Extractor() {}

    public static JarFile getJarSource() {
        JarFile source = null;
        try {
            String jarName = util.Runtime.getCurrentJarName();
            if (jarName != null) {
                source = new JarFile(jarName);
            }
        }
        catch (IOException e) { e.printStackTrace(); }
        if (source == null) {
            System.out.println("JavaArchiv nicht ermittelbar");
        }
        return source;
    }

    public static boolean extract(ZipFile source, java.io.File target) {
        // Kompatibilitätsimplementierung
        return extract(source, target, false);
    }

    public static boolean extract(ZipFile source, java.io.File target, boolean overwrite) {
        if ( target.exists() ) {
            System.out.println( target.getName() + " vorhanden");
            if (overwrite) {
                System.out.println("Extraktion erzwungen");
            } else {
                System.out.println("Extraktion nicht erforderlich");
                return true;
            }
        } else {
            System.out.println("Ziel-Datei nicht vorhanden, Extraktion erforderlich");
        }
        if (source == null) {
            System.out.println("Archiv nicht übergeben, Quell-Archiv nicht vorhanden, Extraktion nicht möglich");
            return false;
        }
        if ( IO.mkPath( target.getParentFile() )) {
            System.out.println("Pfad OK");
        } else {
            System.out.println("Pfad ungültig");
            return false;
        }
        System.out.println( target.getName() + " wird aus Archiv extrahiert ...");
        ZipEntry entry = source.getEntry( target.getName() );
        if ( IO.extract(source, entry, target) ) {
            System.out.println("Extraktion erfolgreich");
            return true;
        } else {
            System.out.println("Extraktion fehlgeschlagen");
            return false;
        }
    }

}
