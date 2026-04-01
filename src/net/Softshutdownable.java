/*
 *
 */

package net;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.0.0
 *
 */

public interface Softshutdownable extends Shutdownable {

    public void shutdown(long timeout);

}
