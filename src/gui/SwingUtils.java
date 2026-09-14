/*
 *
 */

package gui;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.1
 *
 */

import javax.swing.JComboBox;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;

public class SwingUtils {

    private SwingUtils() {}

    public static void preventComboBoxPopup(JComboBox<?> comboBox) {
        comboBox.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                return new BasicComboPopup(comboBox) {
                    @Override
                    public void show() { /* Popup nie anzeigen */ }
                };
            }
        });
    }

}
