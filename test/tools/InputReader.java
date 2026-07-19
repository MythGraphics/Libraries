package tools;

import java.io.*;
import java.net.Socket;

public class InputReader {

    private static BufferedReader in;
    private static PrintWriter out;
    private static Socket s;

    public static void main(String[] args) {
        try {
            in  = new BufferedReader( new InputStreamReader( System.in ));
            System.out.println( "lese von stdin ...\n" );
            String str;
            while ( !( str = in.readLine() ).contains("quit") ) {
                System.out.println( "--> " + str );
                if ( str.startsWith("send ") ) {
                    connect();
                    out.println( str = str.substring(5) );
                    out.flush();
                    System.out.println( "\"" + str + "\" gesendet" );
                }
            }
        }
        catch (IOException e) { e.printStackTrace(); }
        finally {
            try { close(); }
            catch (IOException e) { e.printStackTrace(); }
        }
    }

    private static void connect() {
        if ( out != null ) {
            return;
        }
        try {
            System.out.println("verbinde ...");
            s   = new Socket("localhost", 50000);
            out = new PrintWriter( new BufferedWriter( new OutputStreamWriter( s.getOutputStream() )));
        }
        catch (IOException e) { e.printStackTrace(); }
    }

    private static void close() throws IOException {
        System.out.println( "gebe Ressourcen frei ..." );
        if ( in  != null ) {
            in.close();
        }
        if ( out != null ) {
            out.close();
        }
        if ( s   != null ) {
            s.close();
        }
    }

    private InputReader() {}

}
