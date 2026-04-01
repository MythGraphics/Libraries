/*
 *
 */

package messageHandler;

/*
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.0.1
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class NetMessageReaderThread extends Thread {

    private final MessageHandler messageHandler;
    private final PipedWriter messageWriter;

    public NetMessageReaderThread(PipedWriter messageWriter, MessageHandler messageHandler) {
        this.messageWriter = messageWriter;
        this.messageHandler = messageHandler;
    }

    @Override
    public void run() {
        PipedReader messageReader = null;
        BufferedReader pin = null;
        try {
            messageReader = new PipedReader();
            messageReader.connect( messageWriter );
            System.out.println( "*NetMessage-Log-Pipe successfully established" );
            pin = new BufferedReader( messageReader) ;
            while ( !isInterrupted() ) {
                if ( pin.ready() )
                    messageHandler.writeInLog( pin.readLine() );
                Thread.sleep(MessageReaderThread.SLEEPTIME);
            }
        }
        catch (InterruptedException e) { interrupt(); }
        catch (IOException e) {
            e.printStackTrace();
            interrupt();
        }
        finally {
            try {
                pin.close();
                messageReader.close();
            } catch (IOException e) { e.printStackTrace(); }
        }
    }

}
