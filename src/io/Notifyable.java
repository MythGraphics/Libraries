/*
 * Notifyable.java
 *
 * Created on 8. März 2009, 01:38
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package io;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 2.0.0
 *
 */

public interface Notifyable {

    public boolean isReady();
    public void doNotify();
    public void reset();

}
