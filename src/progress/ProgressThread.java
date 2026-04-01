/*
 * ProgressThread.java
 *
 * Created on 11. Februar 2008, 15:00
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package progress;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.2.0
 *
 */

import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;

public class ProgressThread extends Thread implements Progressable {

    private final PipedWriter pWriter;
    private final PrintWriter pout;

    private long value = 0;
    /**
     * Daten in ProgressWriter (true) oder System.out (false) schreiben
     */
    private boolean useprowri = false;

    public ProgressThread() {
        setDaemon(true);
        pWriter = new PipedWriter();
        pout = new PrintWriter( pWriter );
    }

    private void close() {
        try {
            pout.close();
            pWriter.close();
        } catch (IOException e) { e.printStackTrace(); }
    }

    @Override
    public PipedWriter getProgressWriter() {
        useprowri = true;
        return pWriter;
    }

    public synchronized void addValue(long x) {
        value += x;
    }

    private String getValue() {
        return String.valueOf( value );
    }

    @Override
    public void run() {
        while ( !isInterrupted() ) {
            try {
                if ( useprowri ) {
                    pout.println( getValue() );
                    pout.flush();
                } else {
                    System.out.println( getValue() + " Bytes transfered" );
                }
                Thread.sleep( 500 );
            }
            catch (InterruptedException e) { this.interrupt(); }
        }
        close();
    }

}
