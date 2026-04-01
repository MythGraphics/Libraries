/*
 * FileIO.java
 *
 * Created on 26. Juni 2009, 17:53
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package io;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 2.0.1
 *
 */

import java.io.File;
import java.io.IOException;

public class FileIO extends IOCore {

    public FileIO(File file) throws IOException {
        super( IOBuilder.getBinaryIOFromFile( file ), IOBuilder.getTextIOFromFile( file ));
    }

    public FileIO(String str) throws IOException {
        this( new File( str ));
    }

}
