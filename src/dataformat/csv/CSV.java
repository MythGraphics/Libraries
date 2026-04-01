/*
 *
 */

package dataformat.csv;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 2.0.1
 *
 */

import java.util.ArrayList;
import java.io.IOException;
import java.io.File;

public class CSV {

    private ArrayList<String> header;
    private ArrayList<ArrayList<String>> dataset;

    public CSV(ArrayList<String> header, ArrayList<ArrayList<String>> dataset) {
        this.header = header;
        this.dataset = dataset;
    }

    public CSV(ArrayList<ArrayList<String>> dataset, boolean firstLineIsHeader) {
        if (firstLineIsHeader) {
            this.dataset = dataset;
            this.header = this.dataset.remove(0);
        }
    }

    public CSV(File csvfile, boolean firstLineIsHeader) throws IOException {
        this( new Reader( csvfile, new Parser() ), firstLineIsHeader );
    }

    public CSV(Reader reader, boolean firstLineIsHeader) throws IOException {
        if (firstLineIsHeader) {
            this.header = reader.readLine();
        }
        this.dataset = reader.readDataset();
    }

    public ArrayList<String> getHeader() {
        return header;
    }

    public ArrayList<ArrayList<String>> getDataset() {
        return dataset;
    }

    private StringBuilder toLine(ArrayList<String> list) {
        StringBuilder sb = new StringBuilder();
        for ( String s : list ) {
            sb.append(s);
            sb.append(',');
        }
        sb.deleteCharAt( sb.length()-1 );
        sb.append('\n');
        return sb;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (header != null) {
            sb.append( toLine( header ));
        }
        for ( ArrayList<String> innerList : dataset) {
            sb.append( toLine( innerList ));
        }
        return sb.toString();
    }

}
