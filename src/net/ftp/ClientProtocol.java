/*
 *
 */

package net.ftp;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 5.0.3
 *
 */

import java.io.File;
import java.io.IOException;
import java.io.PipedWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.StringTokenizer;
import net.*;
import net.util.IPAddress;
import progress.Progressable;

public class ClientProtocol extends AbstractClientProtocol implements Progressable {

    public final static int     STANDARD_PROTOCOL_PORT  = 21;
    public final static int     STANDARD_DATA_PORT      = 20;
    public final static char    TRANSMISSION_PASSIVE    = 'p';
    public final static char    TRANSMISSION_ACTIVE     = 'a';
    public final static char    TYPE_ASCII              = 'A';
    public final static char    TYPE_BINARY             = 'I';
    public final static String  PREVIOUS_DIR            = "../";

    private final static int    TERMINATE_CODE          = 421;
    private final Socket socket;

    private int activePort = STANDARD_DATA_PORT;
    private char transtype = TRANSMISSION_PASSIVE;
    private PipedWriter pWriter;

    public ClientProtocol(SocketInterface si) throws IOException {
        this.socket = si.getSocket();
    }

    @Override
    public Socket getSocket() {
        return socket;
    }

    @Override
    public PipedWriter getProgressWriter() {
        return pWriter;
    }

    @Override
    public boolean isTerminateSignal() {
        return getCurrentMessageCode() == TERMINATE_CODE;
    }

    public void setTransmissionType(char type) {
        this.transtype = type;
    }

    public void setActivePort(int port) {
        this.activePort = port;
    }

    public boolean logIn(Login login) {
        return logIn( login.getUser(), login.getPass() );
    }

    public boolean logIn(String user, char[] pass) {
        if ( sendCom( "USER " + user ) == 331 ) {
            return ( sendCom( "PASS " + String.valueOf( pass )) == 230 );
        } else {
            return false;
        }
    }

    public boolean changeDir(String dir) {
        return ( sendCom( "CWD " + dir ) == 250 );
    }

    public boolean setDataType(char type) {
        return ( sendCom( "TYPE " + type ) == 200 );
    }

    public boolean rename(String oldName, String newName) {
        if ( sendCom("RNFR " + oldName) == 350 ) {
            return ( sendCom("RNTO " + newName) == 250 );
        }
        return false;
    }

    /**
     * NOOP --> NoOp --> No-Operation --> Verbinung aufrecht erhalten
     * @return Indicates, if the command was successfull
     */
    public boolean noop() {
        return ( sendCom("NOOP") == 200 );
    }

    public boolean deleteFile(String filename) {
        return ( sendCom("DELE " + filename) == 250 );
    }

    public long getFileSize(String filename) {
        if ( sendCom( "SIZE " + filename ) == 213 ) {
            return Long.parseLong( getCurrentMessageString() );
        } else {
            return -1l;
        }
    }

    public void disconnect() throws IOException {
        // ... wenn nicht bereits terminiert, Verbindung terminieren
        if ( getCurrentMessageCode() != TERMINATE_CODE ) {
            sendCom("QUIT");
            // Antwort-Code: 221
        }
        close();
    }

    public boolean getFile(String sourceFilename, File targetFile) throws IOException {
        DataTransmitter data = generateDataChannel();
        data.downloadFile( targetFile ).start();
        return checkTransfere( sendCom( "RETR " + sourceFilename ));
    }

    public boolean sendFile(String targetFilename, File sourceFile) throws IOException {
        DataTransmitter data = generateDataChannel();
        data.uploadFile( sourceFile ).start();
        return checkTransfere( sendCom( "STOR " + targetFilename ));
    }

    private DataTransmitter generateDataChannel() throws IOException {
        DataTransmitter data = null;
        if ( transtype == TRANSMISSION_PASSIVE ) {
            data = new DataTransmitter( new ServiceContainer( setPassiveMode() ));
        } else if ( transtype == TRANSMISSION_ACTIVE ) {
            data = new DataTransmitter( new ServiceContainer( setActiveMode( activePort ) ));
        }
        if ( data != null ) {
            System.out.println( "Data-Connection successfully established" );
        } else {
            System.err.println( "Unable to establish Data-Connection" );
        }
        pWriter = data.getProgressWriter();
        return data;
    }

    public ArrayList<String> getFileList() throws IOException {
        ArrayList<String> empty = new ArrayList<>(1);
        empty.add(PREVIOUS_DIR);
        AbstractDataTransmitter data = generateDataChannel();
        if ( !checkTransfere( sendCom("NLST") )) {
            return empty;
        }
        ArrayList<String> list = data.getFileList();
        while ( !data.isReady() ) {
//      while ( getCurrentMessageCode() == 150 ) {
            try { Thread.sleep(20); }
            catch (InterruptedException e) {}
        }
        if ( getCurrentMessageCode() != 226 ) {
            return empty;
        }
        list.add( 0, PREVIOUS_DIR );
        list.trimToSize();
        return list;
    }

    private ServiceAddress setActiveMode(int port) throws IOException {
        // alternativ "SocketIO" als return-object
        byte portByte1 = (byte) ( port >>> 8 );
        byte portByte2 = (byte) port;
        String portString = "," + String.valueOf( portByte1 ) + "," + String.valueOf( portByte2 );
        String publicIPAddress = IPAddress.getPublicIPAddress();
        String portCommandString = publicIPAddress.replace( ".", "," ) + portString;

        if ( sendCom( "PORT " + portCommandString ) == 200 ) {
            InetAddress address = getSocket().getInetAddress();
            return new ServiceAddress( address, port );
        } else
            return null;
    }

    private ServiceAddress setPassiveMode() throws IOException {
        // alternativ "SocketIO" als return-object
        if ( sendCom( "PASV" ) == 227 ) {
            StringBuffer ip;
            StringTokenizer tokenizer = new StringTokenizer( getCurrentMessageString(), "(),", false );
            tokenizer.nextToken();
            ip = new StringBuffer( tokenizer.nextToken() );
            ip.append(".");
            ip.append( tokenizer.nextToken() );
            ip.append(".");
            ip.append( tokenizer.nextToken() );
            ip.append(".");
            ip.append( tokenizer.nextToken() );
            String dataIp = String.valueOf( ip );
            int dataPort = Integer.parseInt( tokenizer.nextToken() ) << 8 |
                           Integer.parseInt( tokenizer.nextToken() );
            return new ServiceAddress( dataIp, dataPort );
        } else
            return null;
    }

    private boolean checkTransfere(int code) {
        return (code == 150);
    }

}
