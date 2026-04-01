package progress;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.0.4
 *
 */

import java.io.PipedWriter;

@FunctionalInterface
public interface Progressable {

    PipedWriter getProgressWriter();

}
