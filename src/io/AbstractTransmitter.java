/*
 *
 */

package io;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.0.0
 *
 */

import java.io.IOException;

public abstract class AbstractTransmitter extends TransmitterCore {

    /**
     * Transfere data from local to remote: local --> remote
     * @throws IOException if an I/O-Error occurs
     */
    abstract public void put() throws IOException;

    /**
     * Does the same as put().
     * @see AbstractTransmitter#put()
     * @throws IOException if an I/O-Error occurs
     */
    public void upload() throws IOException {
        put();
    }

    /**
     * Transfere data from remote to local: remote --> local
     * @throws IOException if an I/O-Error occurs
     */
    abstract public void get() throws IOException;

    /**
     * Does the same as get().
     * @see AbstractTransmitter#get()
     * @throws IOException if an I/O-Error occurs
     */
    public void download() throws IOException {
        get();
    }

}
