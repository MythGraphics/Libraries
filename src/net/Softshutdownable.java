/*
 *
 */

package net;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.0.1
 *
 */

public interface Softshutdownable extends Shutdownable {

    void shutdown(long timeout);

}
