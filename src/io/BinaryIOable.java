/*
 *
 */

package io;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.1
 *
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public interface BinaryIOable {

    BufferedInputStream getBinaryReader();
    BufferedOutputStream getBinaryWriter();

}
