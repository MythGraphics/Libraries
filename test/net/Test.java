package net;

import java.net.*;
import java.io.*;

class Test {

    public static void main(String args[]) throws IOException {
        int port = 44010;
        if (args.length >= 0) {
            port = Integer.parseInt(args[0]);
        }
        System.out.println("Port " + port + "\n");

        ServerSocket ss = new ServerSocket(port);
        Socket socket   = ss.accept();
        BufferedReader reader = new BufferedReader( new InputStreamReader( socket.getInputStream() ));
        PrintWriter writer = new PrintWriter ( new OutputStreamWriter( socket.getOutputStream() ));

        do {
            System.out.println( reader.readLine() );
        }
        while ( reader.ready() );
        writer.println("test message");
        writer.println();
        writer.println("access denied");
        // writer.flush();

        writer.close();
        reader.close();
        socket.close();
        ss.close();
    }

}