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

public class BinaryTransmitter extends AbstractTransmitter {

    private final BinaryIOable local;
    private final BinaryIOable remote;

    public BinaryTransmitter(BinaryIOable local, BinaryIOable remote) {
        this.local  = local;
        this.remote = remote;
    }

    /**
     * Transfere data from local to remote: local --> remote
     * @param local The local data source
     * @param remote The remote data source
     * @throws IOException if an I/O-Error occurs
     */
    public void transfere(BinaryIOable local, BinaryIOable remote) throws IOException {
        super.transfere( local.getBinaryReader(), remote.getBinaryWriter() );
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
