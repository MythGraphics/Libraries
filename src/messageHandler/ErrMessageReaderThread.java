/*
 * ErrMessageReaderThread.java
 *
 * Created on 13. Februar 2008, 17:22
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
import java.io.PipedOutputStream;
import java.io.PrintStream;

public class ErrMessageReaderThread extends MessageReaderThread {

    private final MessageHandler messageHandler;

    public ErrMessageReaderThread(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    @Override
    void setOutputStream(PipedInputStream reader) throws IOException {
        System.setErr( new PrintStream( new PipedOutputStream(reader) ));
        System.out.println("*Error-Log-Pipe successfully established");
    }

    @Override
    void handleMessage(char[] chars) {
        messageHandler.error( String.valueOf(chars).trim() );
    }

}
