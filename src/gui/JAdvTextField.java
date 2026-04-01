/*
 *
 */

package gui;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 3.0.3
 *
 */

import java.awt.Color;
import util.ColorLibrary;

public class JAdvTextField extends javax.swing.JTextField {

    public final static int MESSAGE = 0;
    public final static int SUCCESS = 1;
    public final static int PROBLEM = 2;
    public final static int WARNING = 3;
    // ERROR value is used from subclass JTextField - not appropriate, but useful

    public JAdvTextField() {}

    public void show(int type) {
        switch (type) {
            case (MESSAGE):
                setBackground(ColorLibrary.LIGHT_BLUE);
                break;
            case (SUCCESS):
                setBackground(ColorLibrary.LIGHT_GREEN);
                break;
            case (PROBLEM):
                setBackground(ColorLibrary.YELLOW);
                break;
            case (WARNING):
                setBackground(Color.ORANGE);
                break;
            case (ERROR):
                setBackground(ColorLibrary.LIGHT_RED);
                break;
        }
    }

    public synchronized void showSuccess(String message) {
        show(SUCCESS);
        setText(message);
    }

    public synchronized void showMessage(String message) {
        show(MESSAGE);
        setText(message);
    }

    public synchronized void showProblem(String message) {
        show(PROBLEM);
        setText(message);
    }

    public synchronized void showWarning(String message) {
        show(WARNING);
        setText(message);
    }

    public synchronized void showError(String message) {
        show(ERROR);
        setText(message);
    }

    public synchronized void show(String message, int type) {
        show(type);
        setText(message);
    }

}
