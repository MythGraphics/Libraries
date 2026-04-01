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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;

public class BinaryIO implements Closeable, BinaryIOable {

    private final BufferedInputStream in;
    private final BufferedOutputStream out;

    public BinaryIO(BufferedInputStream in, BufferedOutputStream out) {
        this.in = in;
        this.out = out;
    }

    @Override
    public BufferedInputStream getBinaryReader() {
        return in;
    }

    @Override
    public BufferedOutputStream getBinaryWriter() {
        return out;
    }

    @Override
    public void close() throws IOException {
        in.close();
        out.close();
    }

}
