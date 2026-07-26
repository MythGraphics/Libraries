package tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ConsoleReciever {

    private static ServerSocket ss;
    private static Socket s;
    private static BufferedReader in;

    private final static int PORT = 50000;

    private ConsoleReciever() {}

    public static void main(String[] args) {
        String str;
        try {
            ss = new ServerSocket(PORT);
            System.out.println("warte auf Verbindung ...");
            s  = ss.accept();
            in = new BufferedReader( new InputStreamReader( s.getInputStream() ));
            System.out.println("lese von Port " + PORT + " ...");
            while (( str = in.readLine() ) != null ) {
                System.out.println("<-- " + str);
            }
        }
        catch (IOException e) { e.printStackTrace(); }
        finally { close(); }
    }

    private static void close() {
        if ( in  != null ) { try { in.close(); } catch (IOException ignore) {} }
        if ( s   != null ) { try { s.close();  } catch (IOException ignore) {} }
        if ( ss  != null ) { try { ss.close(); } catch (IOException ignore) {} }
    }

}
