package tools;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.1
 *
 */

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class WindowPrinter {

    public final static String NAME    = "MythGraphics WindowsPrinter";
    public final static String VERSION = "1.0.1";

    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            try {
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_PRINTSCREEN);
                r.keyRelease(KeyEvent.VK_PRINTSCREEN);
                Runtime.getRuntime().exec("mspaint");
                try { Thread.sleep(3000); }
                catch (InterruptedException e) {}
                r.keyPress(KeyEvent.VK_CONTROL);
                r.keyPress(KeyEvent.VK_V);
                r.keyRelease(KeyEvent.VK_V);
                r.keyRelease(KeyEvent.VK_CONTROL);
                try { Thread.sleep(100); }
                catch (InterruptedException e) {}
                r.keyPress(KeyEvent.VK_CONTROL);
                r.keyPress(KeyEvent.VK_P);
                r.keyRelease(KeyEvent.VK_P);
                r.keyRelease(KeyEvent.VK_CONTROL);
/*
                try { Thread.sleep(500); }
                catch (InterruptedException e) {}
                r.keyPress(KeyEvent.VK_ENTER);
                r.keyPress(KeyEvent.VK_ENTER);
                try { Thread.sleep(100); }
                catch (InterruptedException e) {}

                r.keyPress(KeyEvent.VK_ALT);
                r.keyPress(KeyEvent.VK_F4);
                r.keyRelease(KeyEvent.VK_F4);
                r.keyRelease(KeyEvent.VK_ALT);
                try { Thread.sleep(100); }
                catch (InterruptedException e) {}
                r.keyPress(KeyEvent.VK_N);
                r.keyRelease(KeyEvent.VK_N);
                try { Thread.sleep(100); }
                catch (InterruptedException e) {}
 */
            }
            catch (AWTException | IOException e) { e.printStackTrace(); }
        }
        else if ( args[0].equalsIgnoreCase("--help") )
        {
            printHelp();
        }
        else if ( args[0].equalsIgnoreCase("--version") )
        {
            System.out.println(NAME + " v" + VERSION);
        }
        else
        {
            System.err.println("Parameter \"" + args[0] + "\" unbekannt");
            System.err.println();
            printHelp();
        }
    }

    private static void printHelp() {
        System.out.println("Druckt das aktuelle Bild des Bildschirms");
        System.out.println();
        System.out.println("Parameter:");
        System.out.println("  --help        zeigt diese Hilfe an");
        System.out.println("  --version     zeigt Programm-Version an");
        System.out.println();
    }

}
