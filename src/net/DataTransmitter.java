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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class DataTransmitter extends AbstractDataTransmitter implements Runnable {

    private BufferedInputStream in;
    private BufferedOutputStream out;

    public DataTransmitter(ServiceContainer container) {
        super(container);
    }

    @Override
    Runnable getRunner(BufferedInputStream in, BufferedOutputStream out) {
        this.in  = in;
        this.out = out;
        return this;
    }

    @Override
    public void run() {
        try { super.transfere(in, out); }
        catch (IOException e) { e.printStackTrace(); }
    }

}
