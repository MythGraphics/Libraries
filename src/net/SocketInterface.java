/*
 *
 */

package net;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.0
 *
 */

import java.io.IOException;
import java.net.Socket;

public interface SocketInterface {

    public Socket getSocket() throws IOException;

}
