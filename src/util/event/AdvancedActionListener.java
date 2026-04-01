/*
 *
 */

package util.event;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.0
 *
 */

public interface AdvancedActionListener extends ActionListener {

    /**
     * Overwrite this method to perform an event after every count/interval.
     */
    void intermediateAction();

}
