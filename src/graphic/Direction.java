/*
 *
 */

package graphic;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.0
 *
 */

public enum Direction {

    UP,
    RIGHT,
    DOWN,
    LEFT;

    public final static String DEFAULT_ORIENTATION = "URDL";

    public static Direction parseDirection(char c) {
        switch (c) {
            case 'U': case 'u': return UP;
            case 'R': case 'r': return RIGHT;
            case 'D': case 'd': return DOWN;
            case 'L': case 'l': return LEFT;
            default           : return null;
        }
    }

    public static Direction invert(Direction d) {
        switch (d) {
            case UP    : return DOWN;
            case RIGHT : return LEFT;
            case DOWN  : return UP;
            case LEFT  : return RIGHT;
            default    : return null; // should never be reached
        }
    }

    public static Direction[] parseDirection(String s) {
        if ( s.length() != 4 ) {
            throw new IllegalArgumentException("String have to contain 4 and only 4 characters.");
        }
        Direction[] array = new Direction[4];
        for (int i = 0; i < 4; ++i) {
            array[i] = Direction.parseDirection( s.charAt( i ));
        }
        return array;
    }

}
