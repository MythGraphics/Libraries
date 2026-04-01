/*
 * ProgressIOCore.java
 *
 * Created on 8. November 2007, 20:08
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package progress;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.1.0
 *
 */

import java.io.*;

/**
 * Dient mit seinen erbenden Klassen dem Anzeigen des Fortschritts in einem GUI.
 * @author Martin Pröhl alias MythGraphics
 */
public class ProgressIOCore extends ProgressFrame implements Closeable {

    public final long minSize = 524288;
    public final PipedReader pReader;
    private final PipedWriter pWriter;
    private BufferedReader progressReader;
    // TODO BufferedReader wirklich erforderlich / sinnvoll ?

    public ProgressIOCore(int frametype, Progressable pWriter) {
        super( frametype );
        this.pWriter = pWriter.getProgressWriter();
        pReader = new PipedReader();
    }

    @Override
    public void close() {
        try {
            if ( getProgressReader() != null) { getProgressReader().close(); }
            pReader.close();
            pWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            super.dispose();
        }
    }

    public void init() throws IOException {
        pReader.connect( pWriter );
        setProgressReader( new BufferedReader( pReader ));
    }

    public BufferedReader getProgressReader() {
        return progressReader;
    }

    public void setProgressReader(BufferedReader progressReader) {
        this.progressReader = progressReader;
    }

}
