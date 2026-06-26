/*
 *
 */

package io;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 2.0.2
 *
 */

import java.io.File;
import java.io.IOException;

public class FileIO extends IOCore {

    public FileIO(File file) throws IOException {
        super( IOBuilder.getBinaryIO( file ), IOBuilder.getTextIO( file ));
    }

    public FileIO(String str) throws IOException {
        this( new File( str ));
    }

}
