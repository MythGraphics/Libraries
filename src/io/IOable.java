/*
 *
 */

package io;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 2.0.1
 *
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.PrintWriter;

public interface IOable {

    BufferedReader getTextReader();
    PrintWriter getTextWriter();
    BufferedInputStream getBinaryReader();
    BufferedOutputStream getBinaryWriter();

}
