/*
 *
 */

package util.update;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 2.0.0
 *
 */

import java.io.IOException;

public class AutoUpdater implements Runnable {

    private static String parameter = "";

    private final Updater updater;

    private String jarName;

    public static void main(String[] args) {
        if ( args == null || args.length < 3 || args[0].equalsIgnoreCase( "--help" )) {
            printHelp();
            return;
        }

        if ( args[0].startsWith( "--" )) {
            parameter = args[0];
            new Thread( new AutoUpdater( args[1], args[2], args[3] )).start();
        } else {
            new Thread( new AutoUpdater( args[0], args[1], args[2] )).start();
        }
    }

    private static void printHelp() {
        System.out.println("AutoUpdater für Java-Programme");
        System.out.println();
        System.out.println("Aufruf:");
        System.out.println("[program] parameter currentVersion onlineVersionURL updateURL");
        System.out.println();
        System.out.println("Parameter:");
        System.out.println("  --help            zeigt diese Hilfe an");
        System.out.println("  --nodownlaod      kein automatischer Download des Updates");
        System.out.println("  --noinstall       keine automatische Installation nach Download");
        System.out.println("  --norestart       kein automatischer Neustart nach Installation");
        System.out.println("  --update          (optional) automatische Installation und Start (default)");
        System.out.println();
    }

    public AutoUpdater(String currentVersion, String versionUrl, String updateUrl) {
        this.updater = new Updater( Integer.parseInt( currentVersion ), versionUrl, updateUrl );
    }

    @Override
    public void run() {
        System.out.println("Such nach Updates ...");
        if ( !updater.isAvailable() ) {
            System.out.println("Kein Update verfügbar.");
            System.exit(0);
        }
        System.out.println("Update verfügbar.");
        switch (parameter) {
            case "--nodownload":
                System.out.println("Update vorhanden.");
                System.exit(1);
                return;
            case "--noinstall":
                download();
                return;
            case "--norestart":
                install();
                return;
        }

        download();
        install();
        restart();
    }

    private void download() {
        try {
            updater.download();
            System.out.println("Update erfolgreich geladen.");
            System.exit(2);
        } catch (IOException e) {
            System.err.println("Update konte nicht geladen werden.");
            System.exit(255);
        }
    }

    private void install() {
        try {
            jarName = updater.install();
            System.out.println("Update erfolgreich installiert.");
            System.exit(3);
        } catch (IOException e) {
            System.err.println("Update konte nicht installiert werden.");
            System.exit(255);
        }
    }

    private void restart() {
        try {
            updater.restart(jarName);
        } catch (IOException e) {
            System.err.println("Neustart nicht möglich.");
            System.exit(255);
        }
    }

}
