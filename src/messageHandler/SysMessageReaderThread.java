/*
 * SysMessageReaderThread.java
 *
 * Created on 12. Februar 2008, 01:48
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

public class SysMessageReaderThread extends MessageReaderThread {

    private final MessageHandler messageHandler;

    public SysMessageReaderThread(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    @Override
    void setOutputStream(PipedInputStream reader) throws IOException {
        System.setOut( new PrintStream( new PipedOutputStream(reader) ));
        System.out.println("*System-Log-Pipe successfully established");
    }

    @Override
    void handleMessage(char[] chars) {
        if (( chars[0] == MessageHandler.SUCCESS1 ) || ( chars[0] == MessageHandler.SUCCESS2 )) {
            chars[0] = ' ';
            messageHandler.success( String.valueOf( chars ).trim() );
        } else if ( chars[0] == MessageHandler.WARNING ) {
            chars[0] = ' ';
            messageHandler.warning( String.valueOf( chars ).trim() );
        } else
            messageHandler.message( String.valueOf( chars ).trim() );
    }

}
