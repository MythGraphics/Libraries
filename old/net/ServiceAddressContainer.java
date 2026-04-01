/*
 * ServiceAddressContainer.java
 *
 * Created on 18. Mai 2007, 14:29
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 3.0.2
 *
 */

import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.NoSuchElementException;

public class ServiceAddressContainer extends ServiceAddress implements SocketInterface {

    public final static int STANDARD_TIMEOUT = 1*60*1000;                                                               // 1 min

    private int timeout = 0;

    public ServiceAddressContainer(String s)
    throws NoSuchElementException, NumberFormatException, UnknownHostException, MalformedURLException {
        super(s);
    }

    public ServiceAddressContainer(String address, int port) throws UnknownHostException {
        super(address, port);
    }

    public ServiceAddressContainer(InetAddress address, int port) {
        super(address, port);
    }

    public static ServiceAddressContainer build(Socket socket) {
        InetAddress address = socket.getInetAddress();
        int port = socket.getPort();
        return new ServiceAddressContainer(address, port);
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    /**
     * Creates a NEW socket.
     * Each time this method is called a new socket object is created and returned.
     * @return The new created socket.
     * @throws IOException if an I/O-Error occures.
     */
    @Override
    public Socket getSocket() throws IOException {
        Socket s = new Socket( super.getHostString(), super.getPort() );
        s.setSoTimeout(timeout);
        return s;
    }

}
