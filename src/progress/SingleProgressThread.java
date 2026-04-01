/*
 * SingleProgressThread.java
 *
 * Created on 3. Januar 2008, 22:15
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package progress;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.1.0
 *
 */

import java.io.IOException;

public class SingleProgressThread extends ProgressIOCore implements Runnable {
    // Thread beendet sich selbst, muss aber exlizit gestartet werden

    private final long size;

    public SingleProgressThread(long size, Progressable progressWriter) {
        super( ProgressFrame.SINGLE, progressWriter );
        this.size = size;
    }

    @Override
    public void run() {
        long value = 0;
        int p = 0;
        if ( size >= minSize ) {
            super.setVisible(true);
        } else {
            super.cancel();
        }
        try {
            super.init();
            while ( super.isCanceled() ) {
                if ( super.getProgressReader().ready() ) {
                    value = Long.parseLong( super.getProgressReader().readLine() );
                    p = (int)( value * 100.0 / size );
                    super.getProgressBar1().setValue(p);
                }
                if ( (p >= 100) && !( super.getProgressReader().ready() )) {
                    super.cancel();
                }
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            super.cancel();
        }
        catch (IOException e) {
            e.printStackTrace();
            super.cancel();
        }
        finally {
            super.close();
        }
    }

}
