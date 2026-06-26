/*
 *
 */

package io;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.3
 *
 */

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class IOBuilder {

    public final static int STANDARD_TIMEOUT = 1*60*1000; // 1 min

    private IOBuilder() {}

    public static BinaryIO getBinaryIO(File file) throws IOException {
        return new BinaryIO( Reader.getBinaryReader( file ),  Writer.getBinaryWriter( file ));
    }

    public static TextIO getTextIO(File file) throws IOException {
        return new TextIO( Reader.getTextReader( file ),  Writer.getTextWriter( file ));
    }

    public static File getFile(String str) throws IOException {
        return new File(str);
    }

    public static BinaryIO getBinaryIO(Socket socket) throws IOException {
        return new BinaryIO( Reader.getBinaryReader( socket ), Writer.getBinaryWriter( socket ));
    }

    public static TextIO getTextIO(Socket socket) throws IOException {
        return new TextIO( Reader.getTextReader( socket ), Writer.getTextWriter( socket ));
    }

    public static Socket getSocket(int port) throws IOException {
        return getSocket( new ServerSocket( port ));
    }

    public static Socket getSocket(ServerSocket ss) throws IOException {
        if ( ss.getSoTimeout() <= 0 ) {
            ss.setSoTimeout( STANDARD_TIMEOUT );
        }
        Socket socket = ss.accept();
        return socket;
    }

}
