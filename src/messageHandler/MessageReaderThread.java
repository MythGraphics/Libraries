/*
 * MessageReaderThread.java
 *
 * Created on 13. Februar 2008, 17:24
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package messageHandler;

/*
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.0.1
 *
 */

import java.io.IOException;
import java.io.PipedInputStream;

public abstract class MessageReaderThread extends Thread {

    public final static int SLEEPTIME = 20;

    abstract void setOutputStream(PipedInputStream reader) throws IOException;

    abstract void handleMessage(char[] chars);

    @Override
    public void run() {
        PipedInputStream reader = null;
        char[] chars = new char[0xFF];
        try {
            reader = new PipedInputStream();
            setOutputStream(reader);
            while ( !isInterrupted() ) {
                if ( reader.available() > 0 ) {
                    for (int i = 0; (reader.available() > 0); ++i) {
                        chars[i] = (char) reader.read();
                        if (chars[i] == '\n')
                            break;
                    }
                    handleMessage(chars);
                    chars = new char[0xFF];
                }
                Thread.sleep(SLEEPTIME);
            }
        }
        catch (InterruptedException e) {interrupt();}
        catch (IOException e) {
            e.printStackTrace();
            interrupt();
        }
        finally {
            try {reader.close();}
            catch (IOException e) {e.printStackTrace();}
        }
    }

}
