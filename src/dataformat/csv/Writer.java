/*
 *
 */

package dataformat.csv;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 2.0.0
 *
 */

import java.io.*;
import java.util.ArrayList;

public class Writer implements Closeable {

    private final PrintWriter out;
    private boolean isHeaderWritten = false;

    public Writer(File file) throws IOException {
        out = io.Writer.getTextWriter(file);
    }

    public void write(ArrayList<String> header, ArrayList<ArrayList<String>> dataset) {
        StringBuilder sb;
        if ( header != null ) {
            writeDataln(header);
        }
        writeDataset(dataset);
    }

    public void writeHeader(ArrayList<String> header) {
        if ( !isHeaderWritten ) {
            writeDataln(header);
            isHeaderWritten = true;
        }
    }

    public void writeDataset(ArrayList<ArrayList<String>> dataset) {
        for ( ArrayList<String> list : dataset ) {
            writeDataln(list);
        }
    }

    public void writeDataln(ArrayList<String> data) {
        StringBuilder sb = new StringBuilder();
        for ( String s : data ) {
            sb.append(s);
            sb.append(',');
        }
        sb.deleteCharAt( sb.length()-1 );
        out.println( sb.toString() );
    }

    @Override
    public void close() {
        out.close();
    }

}
