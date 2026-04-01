/*
 *
 */

package util;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.2
 *
 */

public class Task implements Runnable {

    private final String command;

    public Task(String command) {
        this.command = command;
    }

    @Override
    public void run() {
        System.out.println("starte externe Anwendung ...");
        try {
            java.lang.Runtime.getRuntime().exec(command);
        }
        catch (SecurityException | java.io.IOException e)   { e.printStackTrace(); }
    }

}
