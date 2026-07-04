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
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Reader implements Closeable {

    private final Parser parser;
    private final BufferedReader in;

    public Reader(File file, Parser parser) throws IOException {
        this.in = io.ReaderFactory.getTextReader(file);
        this.parser = parser;
    }

    public Reader(File file, Charset charset, Parser parser) throws IOException {
        in = new BufferedReader( new InputStreamReader( new FileInputStream( file ), charset ));
        this.parser = parser;
    }

    public ArrayList<String> readLine() throws IOException {
        if ( in.ready() ) {
            return parser.parseln( in.readLine() );
        }
        return null;
    }

    public ArrayList<ArrayList<String>> readDataset() throws IOException {
        ArrayList<ArrayList<String>> dataset = new ArrayList<>();
        while ( in.ready() ) {
            dataset.add( readLine() );
        }
        close();
        return dataset;
    }

    @Override
    public void close() throws IOException {
        in.close();
    }

}
