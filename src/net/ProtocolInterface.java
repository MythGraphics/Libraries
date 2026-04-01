/*
 *
 */

package net;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 2.0.0
 *
 */

import java.io.IOException;

public interface ProtocolInterface {

    public void handleInput() throws IOException;
    public boolean isOnline();
    public String readLine() throws IOException;
    public void sendLine(String s);

}
