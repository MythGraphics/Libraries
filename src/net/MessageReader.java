/*
 * MessageReader.java
 *
 * Created on 10. Februar 2008, 20:37
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.0.1
 *
 */

import java.io.IOException;

public class MessageReader extends Thread {

    private final ProtocolInterface channel;

    public MessageReader(ProtocolInterface channel) {
        this.channel = channel;
        setDaemon(true);
    }

    @Override
    public void run() {
        try {
            do {
                channel.handleInput();
                try { Thread.sleep(20); }
                catch (InterruptedException e) {}
            } while ( channel.isOnline() );
        }
        catch (IOException e) { e.printStackTrace(); }
    }

}
