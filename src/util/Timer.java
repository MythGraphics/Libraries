/*
 *
 */

package util;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 3.0.1
 *
 */

import util.event.ActionListener;
import util.event.AdvancedActionListener;

/**
 * milliSecond is main-unit
 */

public class Timer extends Time implements Runnable {

    /** Einheit/PostString */
    public String msStr = "ms ", sStr = "s ", mStr = "m ", hStr = "h ", dStr = "d ", yStr = "y ";

    private final long initDelay;
    private final int interval = 100;
    private final AdvancedActionListener listener;
    private boolean repeat = false;
    private boolean interrupt = false;
    private Thread timer;
    private String ms;

    /**
     *
     * @param delay delay in milliSeconds
     * @param listener the ActionListener to be executed after delay
     */
    public Timer(long delay, final ActionListener listener) {
        this(
            delay,
            new AdvancedActionListener() {
                @Override
                public void actionPerformed() { listener.actionPerformed(); }
                @Override
                public void intermediateAction() {}
            }
        );
    }

    /**
     *
     * @param delay delay in milliSeconds
     * @param listener the AdvancedActionListener to be executed after delay and every count/interval
     */
    public Timer(long delay, AdvancedActionListener listener) {
        super(delay);
        this.initDelay = delay;
        this.listener = listener;
        ms = util.NumberFormat.getNumber( super.getRemainingMilliseconds(), 3 );
    }

    public String getMilliseconds() {
        if ( super.getRemainingMilliseconds() < 100 ) {
            return ms + msStr;
        } else {
            return String.valueOf( super.getRemainingMilliseconds() ) + msStr;
        }
    }

    public String getSeconds() {
        return String.valueOf( super.getRemainingSeconds() ) + sStr;
    }

    public String getMinutes() {
        return String.valueOf( super.getRemainingMinutes() ) + mStr;
    }

    public String getHours() {
        return String.valueOf( super.getRemainingHours() ) + hStr;
    }

    public String getDays() {
        return String.valueOf( super.getRemainingDays() ) + dStr;
    }

    public String getYears() {
        return String.valueOf( super.getInYears() ) + yStr;
    }

    @Override
    public String toString() {
        return getYears() + getDays() + getHours() + getMinutes() + getSeconds() + getMilliseconds();
    }

    public void isRepeated(boolean repeat) {
        this.repeat = repeat;
    }

    @Override
    public void run() {
        long delay;
        do {
            while (( delay = super.getInMilliseconds() ) > 0 ) {
                try { Thread.sleep(interval); }
                catch (InterruptedException e) {}
                super.setTime( delay - interval );
                listener.intermediateAction();
                if (interrupt) { break; }
            }
            if (interrupt) {
                super.setTime(initDelay);
                return;
            }
            listener.actionPerformed();
            super.setTime(initDelay);
        } while (repeat);
    }

    public void start() {
        interrupt = false;
        timer = new Thread(this);
        timer.start();
    }

    public void stop() {
        interrupt = true;
    }

}
