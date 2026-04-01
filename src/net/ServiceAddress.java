/*
 *
 */

package net;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.0
 *
 */

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class ServiceAddress implements SocketInterface {

    private final InetAddress host;
    private final int port;

    public ServiceAddress(String host, int port) throws UnknownHostException {
        this( InetAddress.getByName(host), port );
    }

    public ServiceAddress(InetAddress host, int port) {
        this.host = host;
        this.port = port;
    }

    public ServiceAddress(String url)
    throws NoSuchElementException, NumberFormatException, UnknownHostException, MalformedURLException {
        int i;
        if (( i = url.indexOf('@') ) >= 0 ) {
            url = url.substring( i+1 );
        }
        StringTokenizer tokenizer = new StringTokenizer( url, ":", false );
        host = InetAddress.getByName( tokenizer.nextToken() );
        port = Integer.parseInt( tokenizer.nextToken() );
    }

    public int getPort() {
        return port;
    }

    public InetAddress getHost() {
        return host;
    }

    public String getHostString() {
        return host.getHostAddress();
    }

    @Override
    public String toString() {
        return host.getHostAddress() + ":" + port + "/";
    }

    /**
     * Creates a NEW socket.
     * Each time this method is called a new socket object is created and returned.
     * @return The new created socket.
     * @throws IOException if an I/O-Error occures.
     */
    @Override
    public Socket getSocket() throws IOException {
        Socket s = new Socket( getHostString(), getPort() );
        return s;
    }

}
