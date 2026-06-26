/*
 *
 */

package io;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 3.1.1
 *
 */

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import net.SocketInterface;

public class SocketIO extends IOCore implements Closeable, SocketInterface {

    private final Socket socket;

    /**
     * @see IOBuilder for utililities
     * @param socket
     * @throws IOException if an I/O-Error occurs
     */
    public SocketIO(Socket socket) throws IOException {
        super( IOBuilder.getBinaryIO( socket ), IOBuilder.getTextIO( socket ));
        this.socket = socket;
    }

    @Override
    public Socket getSocket() {
        return socket;
    }

    @Override
    public void close() throws IOException {
        super.close();
        socket.close();
    }

}
