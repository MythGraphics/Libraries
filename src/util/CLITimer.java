/*
 *
 */

package util;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 2.1.2
 *
 */

/**
 * Sekunde ist die verwendete BasisZeitEinheit dieser Klasse
 * @author Martin Pröhl alias MythGraphics
 */
public class CLITimer extends Thread {

    /** Faktoren zur ZeitBerechnung (Minute, Stunde, Tag, Jahr), Sekunde als Basis */
    public final static int MF = 60, HF = MF*60, DF = HF*24, YF = (int)(DF*365.25);
    /** diverse String-Konstanten */
    private static String dstr = " Tage, ";
    private static String hstr = " Stunden, ";
    private static String mstr = " Minuten, ";
    private static String sstr = " Sekunden bis ZielEreignis ...";
    /** konstruktor-initiallisierungspflichtige Objekte */
    private long delay;
    private final Runnable task;
    /** automatische WarteZeitAuswahl ja/nein */
    private boolean auto = false;
    /**
     * Wartezeit des Threads in Sekunden bis zur erneuten Prüfung der Bedingungen und Ausgabe der
     * Restzeit
     */
    private int sleeptime;

    /**
     * @param task Das Runnable-Objekt, das nach Ablauf des Timers auszuführen ist
     * @param delay Wartezeit in Sekunden bis zur Ausführung
     */
    public CLITimer(Runnable task, long delay) {
        this(task, delay, 1);
    }

    /**
     * @param task Das Runnable-Objekt, das nach Ablauf des Timers auszuführen ist
     * @param delay Wartezeit in Sekunden bis zur Ausführung
     * @param sleeptime Wartezeit des Threads in Sekunden bis zur erneuten Prüfung der Bedingungen
     *                  und Ausgabe der Restzeit;
     *                  0 für automatische Auswahl
     */
    public CLITimer(Runnable task, long delay, int sleeptime) {
        this.task       = task;
        this.delay      = delay;
        this.sleeptime  = sleeptime;
        auto = sleeptime <= 0;
    }

    /**
     * Gibt die noch ausstehende Wartezeit zurück
     * @return Wartezeit in Sekunden
     */
    public long getDelay() {
        return delay;
    }

    @Override
    public void run() {
        int autotime = 0;
        while (delay > 0) {
            if ( super.isInterrupted() ) {
                System.out.println("Timer abgebrochen");
                return;
            }
            if (delay > DF) {
                autotime = DF;                                                                      // in Tagen zählen
                System.out.println(
                        delay/DF + dstr +
                        delay%DF/HF + hstr +
                        delay%DF%HF/MF + mstr +
                        delay%DF%HF%MF + sstr
                );
            }
            else if (delay > HF) {
                autotime = HF;                                                                      // in Stunden Zählen
                System.out.println(
                        delay/HF + hstr +
                        delay%HF/MF + mstr +
                        delay%HF%MF + sstr
                );
            } else if (delay > MF) {
                autotime = MF;                                                                      // in Minuten zählen
                System.out.println(
                        delay/MF + mstr +
                        delay%MF + sstr
                );
            } else {
                autotime = 1;                                                                       // in Sekunden zählen
                System.out.println(delay + sstr);
            }
            if (auto)
                sleeptime = autotime;
            try { Thread.sleep(sleeptime*1000); }                                                   // sleeptime in Sekunden
            catch (InterruptedException e) {}
            delay -= sleeptime;
        }
        System.out.println("Zeit abgelaufen!");
        new Thread(task).start();
    }

}
