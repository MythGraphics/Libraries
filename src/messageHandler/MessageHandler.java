/*
 * MessageHandler.java
 *
 * Created on 27. November 2007, 01:29
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package messageHandler;

/*
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.0.2
 *
 */

import gui.JAdvTextField;
import static io.Reader.getTextReader;
import static io.Writer.getTextWriter;
import java.io.*;
import java.util.StringTokenizer;
import javax.swing.JTextArea;

public class MessageHandler {

    public final static char SUCCESS1 = '+';
    public final static char SUCCESS2 = '*';
    public final static char WARNING  = '-';
    public final static char MESSAGE  = ' ';

    public final JAdvTextField TextField1;
    public final JTextArea TextArea1;

    private NetMessageReaderThread nmrt;
    private SysMessageReaderThread smrt;
    private ErrMessageReaderThread emrt;

    public MessageHandler(JAdvTextField TextField1, JTextArea TextArea1) {
        this.TextField1 = TextField1;
        this.TextArea1  = TextArea1;
    }

    public void startNetMessager(PipedWriter messageWriter) {
        nmrt = new NetMessageReaderThread(messageWriter, this);
        nmrt.start();
    }

    public void interruptNetMessager() {
        if (nmrt != null)
            nmrt.interrupt();
    }

    public void startSysMessager() {
        smrt = new SysMessageReaderThread(this);
        smrt.start();
    }

    public void interruptSysMessager() {
        if (smrt != null)
            smrt.interrupt();
    }

    public void startErrMessager() {
        emrt = new ErrMessageReaderThread(this);
        emrt.start();
    }

    public void interruptErrMessager() {
        if (emrt != null)
            emrt.interrupt();
    }

    public void writeInLog(String message) {
        TextArea1.append(message + '\n');
    }

    public void message(String message) {
        TextField1.show(message, TextField1.MESSAGE);
        writeInLog(message);
    }

    public void success(String message) {
        TextField1.show(message, TextField1.SUCCESS);
        writeInLog(message);
    }

    public void problem(String message) {
        TextField1.show(message, TextField1.PROBLEM);
        writeInLog(message);
    }

    public void warning(String message) {
        TextField1.show(message, TextField1.WARNING);
        writeInLog(message);
    }

    public void error(String message) {
        TextField1.show(message, TextField1.ERROR);
        writeInLog(message);
    }

    public void loadLog(File logFile) throws IOException {
        BufferedReader in = getTextReader(logFile);
        while ( in.ready() )
            TextArea1.append( in.readLine() + "\n" );
        in.close();
    }

    public void saveLog(File logFile) throws IOException {
        StringTokenizer tokenizer = new StringTokenizer(TextArea1.getText(), "\n", false);
        logFile.createNewFile();
        PrintWriter out = getTextWriter(logFile);
        while ( tokenizer.hasMoreTokens() )
            out.println( tokenizer.nextToken() );
        out.flush();
        out.close();
    }

}
