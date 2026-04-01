/*
 * AbstractDataTransmitter.java
 *
 * Created on 6. November 2006, 22:14
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.1.0
 *
 */

import io.Notifier;
import io.Reader;
import io.Writer;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.PipedWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import progress.ProgressThread;
import progress.Progressable;

public abstract class AbstractDataTransmitter extends Notifier implements Progressable, Runnable {

    private final static int ARRAYSIZE   = 0xFF;
    private final static int BUFFER      = 0xFFFF;
    private final static String COMPLETE = "data-connection successfully terminated";

    private final ProgressThread pThread;
    private final ServiceContainer container;

    public AbstractDataTransmitter(ServiceContainer container) {
        this.pThread   = new ProgressThread();
        this.container = container;
    }

    abstract Runnable getRunner(BufferedInputStream in, BufferedOutputStream out);

    private ServiceContainer getContainer() {
        return container;
    }

    @Override
    public PipedWriter getProgressWriter() {
        return pThread.getProgressWriter();
    }

    public Thread uploadFile(File sourceFile) throws IOException {
        BufferedInputStream  in  = Reader.getBinaryReader( sourceFile );
        BufferedOutputStream out = Writer.getBinaryWriter( getContainer().getSocket() );
        return new Thread( getRunner(in, out) );
//      transfere(in, out);
    }

    public Thread downloadFile(File targetFile) throws IOException {
        targetFile.createNewFile();
        BufferedInputStream  in  = Reader.getBinaryReader( getContainer().getSocket() );
        BufferedOutputStream out = Writer.getBinaryWriter( targetFile );
        return new Thread( getRunner(in, out) );
//      transfere(in, out);
    }

    public void transfere(BufferedInputStream in, BufferedOutputStream out) throws IOException {
        super.reset();
        byte buffer[] = new byte[BUFFER];
        int nbytes;
        pThread.start();
        while ( (nbytes = in.read(buffer)) != -1 ) {
            out.write(buffer, 0, nbytes);
            pThread.addValue(nbytes);
        }
        out.flush();
        sleep();                                                                                    // wartet vollständige Übertragung ab
        super.doNotify();
        out.close();
        in.close();
        pThread.interrupt();
        getContainer().close();
        System.out.println(COMPLETE);
        sleep();                                                                                    // wartet vollständiges Schließen ab
    }

    private void sleep() {
        try { Thread.sleep(100); }
        catch (InterruptedException e) {}
    }

    public ArrayList<String> getFileList() throws IOException {
        super.reset();
        BufferedReader in = io.Reader.getTextReader( getContainer().getSocket() );
        ArrayList<String> list = new ArrayList<>(ARRAYSIZE);
        sleep();
        while ( in.ready() ) {
            list.add( in.readLine() );
        }
        super.doNotify();
        in.close();
        getContainer().close();
        System.out.println(COMPLETE);
        return list;
    }

}
