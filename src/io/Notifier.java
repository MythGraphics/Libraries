/*
 *
 */

package io;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 2.0.0
 *
 */

public class Notifier implements Notifyable {

    private boolean value = false;

    public Notifier() {}

    /**
     * Setzt Flag auf WAHR == fertig.
     */
    @Override
    public void doNotify() {
        value = true;
    }

    /**
     * Gibt den Wert des Flags zurück.
     * @return WAHR, wenn \"doNotify\" bereits ausgelöst wurde,
     *         andernfalls FALSCH
     */
    @Override
    public boolean isReady() {
        return value;
    }

    /**
     * Setzt den Flag zurück
     */
    @Override
    public void reset() {
        value = false;
    }

}
