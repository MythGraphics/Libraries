/*
 *
 */

package gui;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.0
 *
 */

import javax.swing.*;
import javax.swing.plaf.basic.*;

public final class SwingUtils {

    private SwingUtils() {}

    public static void preventComboBoxPopup(JComboBox<?> combo) {
        combo.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                return new BasicComboPopup(comboBox) {
                    @Override
                    public void show() {
                        // Popup nie anzeigen
                    }
                };
            }
        });
    }

}
