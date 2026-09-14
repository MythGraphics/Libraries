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

public enum Alignment {

    HORIZONTAL,
    VERTICAL;

    public static Alignment parseAlignment(char a) {
        switch (a) {
            case 'H': case 'h': return HORIZONTAL;
            case 'V': case 'v': return VERTICAL;
            default           : return null;
        }
    }

}
