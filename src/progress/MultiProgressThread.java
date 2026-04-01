/*
 * MultiProgressThread.java
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

public class MultiProgressThread extends ProgressIOCore implements Runnable {
    // Thread beendet sich selbst, muss aber exlizit gestartet werden

    private final long[] sizes;
    private long sumsize = 0;
    private int counter = 0;

    public MultiProgressThread(long[] sizes, Progressable progressWriter) {
        super( ProgressFrame.MULTI, progressWriter );
        this.sizes = sizes;
        for ( ; counter < sizes.length; ++counter ) {
            sumsize += sizes[counter];
        }
    }

    @Override
    public void run() {
        long value = 0, sumvalue = 0;
        int p = 0, psum = 0, i = 0;
        if ( sumsize >= minSize*counter ) {
            super.setVisible(true);
        } else {
            super.cancel();
        }
        try {
            if ( !super.isCanceled() ) {
                super.init();
            }
            while ( !super.isCanceled() ) {
                if ( getProgressReader().ready() ) {
                    value = Long.parseLong( getProgressReader().readLine() );
                    p = (int)( value * 100.0 / sizes[i] );
                    psum = (int)( (sumvalue+value) * 100.0 / sumsize );
                    super.getProgressBar1().setValue(p);
                    super.getProgressBar2().setValue(psum);
                }
                if ( p >= 100 ) {
                    sumvalue += value;
                }
                if (( psum >= 100 ) && !( getProgressReader().ready() )) {
                    super.cancel();
                }
                Thread.sleep( 500 );
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
