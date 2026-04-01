/*
 *
 */

package net.ftp;

import java.io.IOException;
import java.net.UnknownHostException;
import messageHandler.MessageHandler;
import net.ServiceAddress;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.2
 *
 */

public class ftp {

    private ServiceAddress server;
    private ClientProtocol client;
    private MessageHandler messageHandler;
    private boolean connected = false;

    public ftp() {}

    public ftp(String host, int port) throws UnknownHostException {
        setRemote(host, port);
    }

    public final void setRemote(String host, int port) throws UnknownHostException {
        this.server = new ServiceAddress(host, port);
    }

    public boolean connect() throws IOException {
        if (server == null) {
            throw new IOException("remote host not set");
        }
        startMessageHandler();
        client = new ClientProtocol(server);
        connected = client.connect();
        return connected;
    }

    public boolean logIn(String user, char[] pass) {
        if (connected) {
            return client.logIn(user, pass);
        }
        return false;
    }

    public boolean isConnected() {
        return connected;
    }

    public void close() throws IOException {
        client.disconnect();
        messageHandler.interruptNetMessager();
        connected = false;
    }

    public void dispose() {
        messageHandler.interruptSysMessager();
        messageHandler.interruptErrMessager();
    }

    public void setMessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    private void startMessageHandler() {
        if (messageHandler == null) {return;}
        messageHandler.startSysMessager();
        try {Thread.sleep(100);}
        catch (InterruptedException e) {}
        messageHandler.startErrMessager();
        try {Thread.sleep(100);}
        catch (InterruptedException e) {}
    }

}
