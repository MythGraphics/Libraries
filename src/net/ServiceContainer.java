/*
 *
 */

package net;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.1
 *
 */

import java.io.Closeable;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServiceContainer implements Closeable, SocketInterface {

    public final static int STANDARD_TIMEOUT = 1*60*1000;                                           // 1 min

    private final Socket socket;

    public ServiceContainer(Socket socket) throws IOException {
        this.socket = socket;
        socket.setSoTimeout(STANDARD_TIMEOUT);
    }

    public ServiceContainer(ServerSocket ss) throws IOException {
        this( io.IOBuilder.getSocket(ss) );
    }

    public ServiceContainer(ServiceAddress sa) throws IOException {
        this( sa.getSocket() );
    }

    /**
     * Returns the socket held or created by this container.
     * Each time this method is called, the same socket will be returned.
     * @return The socket.
     */
    @Override
    public Socket getSocket() {
        return socket;
    }

    @Override
    public void close() throws IOException {
        socket.close();
    }

    public void setTimeout(int timeout) throws IOException {
        socket.setSoTimeout(timeout);
    }

}
