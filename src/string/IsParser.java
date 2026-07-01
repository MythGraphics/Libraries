/*
 *
 */

package string;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.0
 *
 */

public interface IsParser {

    boolean hasMoreStrings();
    String nextString();
    int getCounter();
    int length();

}
