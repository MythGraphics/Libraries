/*
 *
 */

package io;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.1.0
 *
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PipedWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import progress.ProgressThread;
import progress.Progressable;

public class TransmitterCore extends Notifier implements Progressable {

    private final static String START    = "transferring ...";
    private final static String COMPLETE = "transfere complete";
    private final ProgressThread pThread;

    public TransmitterCore() {
        pThread = new ProgressThread();
    }

    @Override
    public PipedWriter getProgressWriter() {
        return pThread.getProgressWriter();
    }

    /**
     * Transfere binary data as bytes
     * @param in input BufferedInputStream
     * @param out output BufferedOutputStream
     * @throws IOException if an I/O-Error occurs
     */
    public void transfere(BufferedInputStream in, BufferedOutputStream out) throws IOException {
        super.reset();
        byte buffer[] = new byte[IO.BUFFERSIZE];
        int nbytes;
        pThread.start();
        System.out.println(START);
        while (( nbytes = in.read(buffer) ) != -1 ) {
            out.write( buffer, 0, nbytes );
            pThread.addValue(nbytes);
        }
        out.flush();
        System.out.println(COMPLETE);
        super.doNotify();
        close();
    }

    /**
     * Transfere text data as chars
     * @param in input BufferedReader
     * @param out output PrintWriter
     * @throws IOException if an I/O-Error occurs
     */
    public void transfere(BufferedReader in, PrintWriter out) throws IOException {
        super.reset();
        char buffer[] = new char[IO.BUFFERSIZE];
        int nchars;
        pThread.start();
        System.out.println(START);
        while (( nchars = in.read(buffer) ) != -1 ) {
            out.write( buffer, 0, nchars );
            pThread.addValue(nchars);
        }
        out.flush();
        System.out.println(COMPLETE);
        super.doNotify();
        close();
    }

    public ArrayList<String> getList(BufferedReader in) throws IOException {
        super.reset();
        ArrayList<String> list = new ArrayList<>(0xFF);                                                                 // 255 Einträge
        while ( in.ready() ) {
            list.add( in.readLine() );
        }
        super.doNotify();
        in.close();
        System.out.println(COMPLETE);
        return list;
    }
/*
    private void close(Closeable in, Closeable out) throws IOException {
        // wartet komplette Übertragung ab
        try { Thread.sleep(100); }
        catch (InterruptedException e) {}
        pThread.interrupt();
        in.close();
        out.close();
    }
 */

    private void close() {
        // wartet komplette Übertragung ab
        try { Thread.sleep(100); }
        catch (InterruptedException e) {}
        pThread.interrupt();
    }

}
