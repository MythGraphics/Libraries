/*
 *
 */

package io;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.0.1
 *
 */

import java.io.BufferedReader;
import java.io.PrintWriter;

public interface TextIOable {

    BufferedReader getTextReader();
    PrintWriter getTextWriter();

}
