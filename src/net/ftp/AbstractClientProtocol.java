/*
 *
 */

package net.ftp;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 5.0.0
 *
 */

import net.ProtocolChannel;

public abstract class AbstractClientProtocol extends ProtocolChannel {

    public int getCurrentMessageCode() {
        return Integer.parseInt( super.getCurrentMessage().substring(0, 3) );
    }

    public String getCurrentMessageString() {
        return super.getCurrentMessage().substring(4);
    }

    public int sendCom(String com) {
        super.sendLine(com);
        while ( !super.isReady() ) {
            try {Thread.sleep(20);}
            catch (InterruptedException e) {}
        }
        return getCurrentMessageCode();
    }

}
