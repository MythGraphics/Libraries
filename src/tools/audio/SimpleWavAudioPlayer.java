/*
 *
 */

package tools.audio;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.3
 *
 */

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SimpleWavAudioPlayer implements Runnable {

    public final static int INFINITE_LOOP = Clip.LOOP_CONTINUOUSLY;

    private final static String AUDIOFILE = "sound.wav";

    private final String file;
    private final int loops;

    public SimpleWavAudioPlayer(String file) {
        this(file, 0);
    }

    public SimpleWavAudioPlayer(String file, int loops) {
        this.file  = file;
        this.loops = loops;
    }

    @Override
    public void run() {
        try ( Clip clip = AudioSystem.getClip() ) {
            clip.open( AudioSystem.getAudioInputStream( new File( file )));
            clip.loop( loops );
            clip.start();
            do {
                try { Thread.sleep(100); }
                catch (InterruptedException ignore) {}
            }
            while ( clip.isRunning() );
            clip.drain();
        }
        catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        System.out.println( "Arbeitsverzeichnis: " + System.getProperty( "user.dir" ));
        String file = AUDIOFILE;
        if ( args != null && args.length > 0 ) {
            file = args[0];
        }
        System.out.println("Datei: " + file);
        new Thread( new SimpleWavAudioPlayer( file, 0 )).start();
    }

}
