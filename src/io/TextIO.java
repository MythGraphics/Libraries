/*
 *
 */

package io;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.2
 *
 */

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;

public class TextIO implements Closeable {

    private final BufferedReader in;
    private final PrintWriter out;

    public TextIO(BufferedReader in, PrintWriter out) {
        this.in = in;
        this.out = out;
    }

    public BufferedReader getTextReader() {
        return in;
    }

    public PrintWriter getTextWriter() {
        return out;
    }

    @Override
    public void close() throws IOException {
        in.close();
        out.close();
    }

}
