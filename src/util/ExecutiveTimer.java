/*
 *
 */

package util;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.0
 *
 */

import util.event.ActionListener;

public class ExecutiveTimer extends Timer {

    private final Thread task;

    /**
     *
     * @param delay delay in milliSeconds
     * @param task the runnable-object to be executed
     */
    public ExecutiveTimer(long delay, Thread task) {
        super(delay, getActionListener(task) );
        this.task = task;
    }

    public static Thread getThread(Task task) {
        return new Thread(task);
    }

    private static ActionListener getActionListener(final Thread task) {
        return new ActionListener() {
            @Override
            public void actionPerformed() { task.start(); }
        };
    }

    public Thread getEventThread() {
        return task;
    }

}
