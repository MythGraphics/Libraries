/*
 *
 */

package io;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.0
 *
 */

import java.io.IOException;

public class Transmitter extends TransmitterCore implements Runnable {

    public final static char GET    = 'g';
    public final static char PUT    = 'p';
    public final static char BINARY = 'b';
    public final static char TEXT   = 't';

    private final static String IMPOSSIBLE          = "transfere impossible.";
    private final static String MODE_EXCEPTION      = "unknown transfere-mode. " + IMPOSSIBLE;
    private final static String DIRECTION_EXCEPTION = "unknown transfere-direction. " + IMPOSSIBLE;

    private final IOable local, remote;

    private char direction = '0';
    private char mode      = '0';

    public Transmitter(IOable local, IOable remote) {
        this.local  = local;
        this.remote = remote;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public char getDirection() {
        return direction;
    }

    public void setMode(char mode) {
        this.mode = mode;
    }

    public char getMode() {
        return mode;
    }

    public void transfere() throws IOException {
        switch (mode) {
            case BINARY:
                switch (direction) {
                    case GET:
                        super.transfere( local.getBinaryReader(), remote.getBinaryWriter() );
                        break;
                    case PUT:
                        super.transfere( remote.getBinaryReader(), local.getBinaryWriter() );
                        break;
                    default:
                        throw new IOException(DIRECTION_EXCEPTION);
                }
                break;
            case TEXT:
                switch (direction) {
                    case GET:
                        super.transfere( local.getTextReader(), remote.getTextWriter() );
                        break;
                    case PUT:
                        super.transfere( remote.getTextReader(), local.getTextWriter() );
                        break;
                    default:
                        throw new IOException(DIRECTION_EXCEPTION);
                }
                break;
            default:
                throw new IOException(MODE_EXCEPTION);
        }
    }

    @Override
    public void run() {
        try { transfere(); }
        catch (IOException e) { e.printStackTrace(); }
    }

}
