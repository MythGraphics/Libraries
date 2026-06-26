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

import java.io.*;

public class IOCore implements Closeable, IOable {

    private final BinaryIO binary;
    private final TextIO text;

    public IOCore(BinaryIO binary, TextIO text) {
        this.binary = binary;
        this.text   = text;
    }

    @Override
    public BufferedInputStream getBinaryReader() {
        return binary.getBinaryReader();
    }

    @Override
    public BufferedOutputStream getBinaryWriter() {
        return binary.getBinaryWriter();
    }

    @Override
    public BufferedReader getTextReader() {
        return text.getTextReader();
    }

    @Override
    public PrintWriter getTextWriter() {
        return text.getTextWriter();
    }

    @Override
    public void close() throws IOException {
        binary.close();
        text.close();
    }

}
