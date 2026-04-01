/*
 *
 */

package io;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 3.0.0
 *
 */

import java.io.Closeable;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SettingImporter implements Closeable {

    private final BufferedReader in;
    private final HashMap<String, String> settings = new HashMap<>();

    public SettingImporter(BufferedReader in) throws IOException {
        this.in = in;
        read();
        close();
    }

    public SettingImporter(File file) throws IOException {
        this( io.Reader.getTextReader(file) );
    }

    public SettingImporter(URL url) throws IOException {
        this( io.Reader.getTextReader(url) );
    }

    public SettingImporter(String filename) throws IOException {
        this( new File(filename) );
    }

    public SettingImporter() throws IOException {
        this( new File( "settings.ini" ));
    }

    @Override
    public final void close() {
        try { in.close(); }
        catch (IOException e) {}
    }

    private void read() throws IOException {
        String s;
        StringTokenizer t;
        while ( in.ready() ) {
            s = in.readLine();
            if ( !s.contains("=") ) { continue; }
            t = new StringTokenizer( s, "=", false );
            settings.put( t.nextToken(), t.nextToken() );
        }
    }

    public HashMap<String, String> get() {
        return settings;
    }
}
