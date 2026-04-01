/*
 * IOThreadHandler.java
 *
 * Created on 21. Dezember 2009, 12:54
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package io;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.1.3
 *
 */

import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IOThreadHandler implements Closeable {

    private final ExecutorService executor = Executors.newCachedThreadPool();
    private final Transmitter[] array;

    private int lii = -1;                                                                           // last initiated index

    public IOThreadHandler(Transmitter[] array) {
        this.array = array;
        for (int i = 0; i <= lii; ++i) { start(i); }
    }

    /**
     * adds a transmitter object and starts the transmission
     * @param t the transmitter object
     */
    public void add(Transmitter t) {
        ++lii;
        if (lii >= array.length) {
            throw new IndexOutOfBoundsException("Array full. Unable to add any more objects.");
        }
        array[lii] = t;
        start(lii);
    }

    public Transmitter getDataTransfere(int index) {
        return array[index];
    }

    /**
     * restarts the transmission
     * @param index index of the transmitter object
     */
    public final void start(int index) {
        executor.execute( array[index] );
    }

    /**
     * closes the executor
     */
    @Override
    public void close() {
        executor.shutdown();
    }

}
