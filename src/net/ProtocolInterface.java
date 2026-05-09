/*
 *
 */

package net;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 2.0.1
 *
 */

import java.io.IOException;

public interface ProtocolInterface {

    void handleInput() throws IOException;
    boolean isOnline();
    String readLine() throws IOException;
    void sendLine(String s);

}
