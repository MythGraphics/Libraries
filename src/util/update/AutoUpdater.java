/*
 *
 */

package util.update;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.0
 *
 */

import java.io.File;
import java.io.IOException;

public class AutoUpdater implements Runnable {

    private final Update update;

    private static String PARAMETER;
    private static String UPDATEFILESTRING;
    private static String TARGETPATH;

    public static void main(String[] args) {
        if ( args[0] == null || args[0].isEmpty() ) {
            System.out.println("no parameter - nothing to do.");
            System.out.println();
            printHelp();
            return;
        }
        int i = 0;
        if ( args[i].startsWith("--") ) {
            switch ( args[i].toLowerCase() ) {
                case "--help":
                    printHelp();
                    return;
                case "--install":
                    TARGETPATH = args[++i];
                    AutoUpdater.PARAMETER = args[i-1].toLowerCase();
                    break;
                default:
                    AutoUpdater.PARAMETER = args[i].toLowerCase();
            }
            ++i;
        }
        if ( args.length >= i+1 ) {
            // args[i] Programm/Jar-File(ohne Pfad); args[i+1] Version
            new Thread( new AutoUpdater( args[i], args[i+1] )).start();
        }
    }

    private static void printHelp() {
        System.out.println("AutoUpdater für Java-Programme");
        System.out.println();
        System.out.println("Aufruf:");
        System.out.println("[program] parameter jarfile version");
        System.out.println();
        System.out.println("Parameter:");
        System.out.println("  --help            zeigt diese Hilfe an");
        System.out.println("  --nodownlaod      kein automatischer Download des Updates");
        System.out.println("  --noinstall       keine automatische Installation nach Download");
        System.out.println("  --install [path]  automatische Installation und Start");
        System.out.println();
    }

    public AutoUpdater(String program, String version) {
        this.update = new Update( program, version );
    }

    @Override
    public void run() {
        System.out.println("Such nach Updates ...");
        if ( !update.isAvailable() ) {
            System.out.println("Kein Update verfügbar.");
            System.exit(0);
        }
        System.out.println("Update verfügbar.");
        switch ( PARAMETER ) {
            case "--nodownload":
                System.exit(1);                                                                                         // ERRORLEVEL 1 --> Update vorhanden
            case "--noinstall":
                if ( download() ) {
                    System.exit(2);                                                                                     // ERRORLEVEL 2 --> Update vorhanden + geladen
                }
                System.exit(255);                                                                                       // ERRORLEVEL 255 --> Fehler
        }
        if ( !download() ) {
            System.exit(255);
        }
        if ( !install(TARGETPATH) ) {
            System.exit(255);
        }
    }

    public static String getJarExecutionDirectory() {
        String jarFile, jarDirectory;
        int cutFileSeperator, cutSemicolon;
        jarFile = System.getProperty( "java.class.path" );

        // Cut seperators
        cutFileSeperator = jarFile.lastIndexOf( System.getProperty( "file.separator" ));
        jarDirectory = jarFile.substring( 0, cutFileSeperator );

        // Cut semicolons
        cutSemicolon = jarDirectory.lastIndexOf(';');
        jarDirectory = jarDirectory.substring( cutSemicolon+1, jarDirectory.length() );

        return jarDirectory+System.getProperty("file.separator");
    }

    private boolean install(String targetpath) {
        if (( targetpath == null ) || targetpath.isEmpty() ) {
            targetpath = getJarExecutionDirectory();
        }
        targetpath += update.getProgram();
        final String target = targetpath;
        try {
            io.IO.copy( UPDATEFILESTRING, target );
            System.out.println("Installation erfolgreich.");
            new Thread() {
                @Override
                public void run() {
                    try {
                        Runtime.getRuntime().exec( "java -jar " + target );
                        System.out.println("Programm gestartet.");
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("\nProgramm konnte nicht gestartet werden.");
                    }
                }
            }.start();
            return true;
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("\nInstallation fehlgeschlagen.");
            return false;
        }
    }

    private boolean download() {
        File updatepathfile = new File( "update" + File.pathSeparator );
        updatepathfile.mkdir();
        UPDATEFILESTRING = updatepathfile.getAbsolutePath() + File.pathSeparator + update.getProgram();
        boolean success = update.download( UPDATEFILESTRING );
        if ( success ) {
            System.out.println("Update geladen.");
        } else {
            System.out.println("\nUpdate konnte nicht geladen werden.");
        }
        return success;
    }

}
