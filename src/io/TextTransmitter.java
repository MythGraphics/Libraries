/*
 *
 */

package io;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.1
 *
 */

import java.io.IOException;

public class TextTransmitter extends AbstractTransmitter {

    private final TextIOable local;
    private final TextIOable remote;

    public TextTransmitter(TextIOable local, TextIOable remote) {
        this.local  = local;
        this.remote = remote;
    }

    /**
     * Transfere data from local to remote: local --> remote
     * @param local The local data source
     * @param remote The remote data source
     * @throws IOException if an I/O-Error occurs
     */
    public void transfere(TextIOable local, TextIOable remote) throws IOException {
        super.transfere( local.getTextReader(), remote.getTextWriter() );
    }

    @Override
    public void put() throws IOException {
        transfere( local, remote );
    }

    @Override
    public void get() throws IOException {
        transfere( remote, local );
    }

}
