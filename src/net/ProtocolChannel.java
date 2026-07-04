/*
 *
 */

package net;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.0.1
 *
 */

import io.Notifier;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import net.util.ProtocolStatics;

public abstract class ProtocolChannel extends Notifier implements Closeable, ProtocolInterface {

    private BufferedReader in;
    private PrintWriter out;
    private String address;
    private String currentMessage;
    private Thread reader;
    private boolean online = false;

    public abstract Socket getSocket() throws IOException;
    public abstract boolean isTerminateSignal();

    public boolean connect() {
        try {
            address = getSocket().getInetAddress().getHostAddress();
            in  = io.ReaderFactory.getTextReader( getSocket() );
            out = io.WriterFactory.getTextWriter( getSocket() );
            System.out.println("Protocol connection established.");
            online = true;
            reader = new MessageReader(this);
            reader.start();
            Thread.sleep(100);
        }
        catch (InterruptedException e) {}
        catch (IOException e) {
            e.printStackTrace();
            close();
            return false;
        }
        return true;
    }

    public String getCurrentMessage() {
        return currentMessage;
    }

    @Override
    public String readLine() throws IOException {
        String s = in.readLine();
        System.out.println( address + ProtocolStatics.INCOMMING + s );
        return s;
    }

    @Override
    public void handleInput() throws IOException {
        currentMessage = readLine();
        super.doNotify();
        if ( isTerminateSignal() && isOnline() ) {                                                                      // nur close() aufrufen, wenn nicht bereits geschehen
            close();
        }
    }

    @Override
    public synchronized void sendLine(String s) {
        super.reset();
        out.println(s);
        out.flush();
        System.out.println( address + ProtocolStatics.OUTGOING + s );
    }

    public void setOffline() {
        close();
    }

    @Override
    public void close() {
        online = false;
        super.reset();
        try {
            in.close();
            out.close();
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
        catch (IOException e) { e.printStackTrace(); }
        try {
            getSocket().close();
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            System.out.println("Protocol connection terminated.");
        }
        catch (IOException e) { e.printStackTrace(); }
    }

    @Override
    public boolean isOnline() {
        return online;
    }

}
