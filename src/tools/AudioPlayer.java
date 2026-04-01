/*
 *
 */

package tools;

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

public class AudioPlayer implements Runnable {

    public final static int INFINITE_LOOP = Clip.LOOP_CONTINUOUSLY;

    private final static String AUDIOFILE = "sound.wav";

    private final File file;
    private final int loops;

    public AudioPlayer(File file) {
        this( file, 0 );
    }

    public AudioPlayer(File file, int loops) {
        this.file  = file;
        this.loops = loops;
    }

    @Override
    public void run() {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open( AudioSystem.getAudioInputStream( file ));
            clip.loop( loops );
            clip.start();
            do {
                try { Thread.sleep(100); }
                catch (InterruptedException e) {}
            }
            while ( clip.isRunning() );
        }
        catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) { e.printStackTrace(); }
    }

    public static void main(String args[]) {
        System.out.println( "Arbeitsverzeichnis: " + System.getProperty( "user.dir" ));
        new Thread( new AudioPlayer( new File( AUDIOFILE ), 0 )).start();
    }

}
