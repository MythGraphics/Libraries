package tools;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Reciever {

    private static ServerSocket ss;
    private static Socket s;
    private static BufferedReader in;

    private final static int PORT = 50000;

    public static void main(String[] args) {
        String str;
        try {
            ss  = new ServerSocket(PORT);
            System.out.println("warte auf Verbindung ...");
            s   = ss.accept();
            in  = new BufferedReader( new InputStreamReader( s.getInputStream() ));
            System.out.println( "lese von Port " + PORT + " ..." );
            while ( ( str = in.readLine() ) != null ) {
                System.out.println( "<-- " + str );
            }
        }
        catch (IOException e) { e.printStackTrace(); }
        finally {
            try { close(); }
            catch (IOException e) { e.printStackTrace(); }
        }
    }

    private static void close() throws IOException {
        System.out.println( "gebe Ressourcen frei ..." );
        if ( in  != null ) in.close();
        if ( s   != null ) s.close();
        if ( ss  != null ) ss.close();
    }

    private Reciever() {}

}
