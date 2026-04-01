/*
 *
 */

package util;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.1
 *
 */

// milliSecond is main-unit
public class Time {

    /** Faktoren zur ZeitBerechnung (Sekunde, Minute, Stunde, Tag, Jahr), MilliSekunde als Basis */
    public final static int SF = 1000, MF = 60, HF = 60, DF = 24;
    public final static double YF = 365.25;
    public final static long
        SECOND = SF,
        MINUTE = SECOND*MF,
        HOUR = MINUTE*HF,
        DAY = HOUR*DF,
        YEAR = (long)(DAY*YF);

    private long time = 0;

    public Time() {}

    /**
     *
     * @param time Time in milliSeconds
     */
    public Time(long time) {
        setTime(time);
    }

    public final void setTime(long time) {
        this.time = time;
    }

    public long getInMilliseconds() {
        return time;
    }

    public long getInSeconds() {
        return time/SECOND;
    }

    public long getInMinutes() {
        return time/MINUTE;
    }

    public long getInHours() {
        return time/HOUR;
    }

    public long getInDays() {
        return time/DAY;
    }

    public long getInYears() {
        return time/YEAR;
    }

    public int getRemainingMilliseconds() {
        return (int)(time%SF);
    }

    public int getRemainingSeconds() {
        return (int)(getInSeconds()%MF);
    }

    public int getRemainingMinutes() {
        return (int)(getInMinutes()%HF);
    }

    public int getRemainingHours() {
        return (int)(getInHours()%DF);
    }

    public int getRemainingDays() {
        return (int)(getInDays()%YF);
    }

    public static void stop(long millis) {
        try { Thread.sleep(millis); } catch (InterruptedException e) {}
    }

}
