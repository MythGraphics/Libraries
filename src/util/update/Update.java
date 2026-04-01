/*
 *
 */

package util.update;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 3.0.0
 *
 */

import io.Reader;
import io.Writer;
import io.SettingImporter;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Update {

    final static String DEFAULT_SOURCE  = "D:\\Google Drive\\Java\\bin\\";
    final static String DEFAULT_INI     = "D:\\Google Drive\\Java\\Projekte\\org\\mythgraphics\\_Libraries\\src\\util\\update\\mythgraphics.ini";

    private final String source;
    private final String ini;
    private final String program;                                                                                       // Programm/Jar-File(ohne Pfad)
    private final String version;

    private HashMap<String, String> dataset;

    public Update(String program, String version) {
        this( DEFAULT_SOURCE, DEFAULT_INI, program, version );
    }

    public Update(String source, String ini, String program, String version) {
        this.source     = source;
        this.ini        = ini;
        this.program    = program;
        this.version    = version;
    }

    public String getProgram() {
        return program;
    }

    public String getVersion() {
        return version;
    }

    public boolean isAvailable() {
        if ( dataset == null ) {
            try {
                dataset = new SettingImporter(ini).get();
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        if ( !dataset.containsKey(program) ) {
            return false;
        }

        return getVersion( dataset.get( program )) > getVersion( version );
    }

    public int getVersion(String version) {
        if ( !version.contains( "." )) {
            return Integer.parseInt( version );
        }
        StringTokenizer t = new StringTokenizer( version, ".", false );
        int v = 0;
        for ( int i = t.countTokens(); i > 0; --i ) {
            v += Integer.parseInt( t.nextToken() )*i;
        }
        return v;
    }

    public boolean download() {
        return download( program );
    }

    public boolean download(String file) {
        if ( !isAvailable() ) {
            return false;
        }
        try {
            Writer.write(
                Reader.getBinaryReader( new File( source + program )),
                Writer.getBinaryWriter( new File( file ))
            );
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}
