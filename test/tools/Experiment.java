package tools;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.0
 *
 */

public class Experiment {

    public static void main(String[] args) {
        char start = 'A', end = 'Z';
        char[][] c = new char[end-start+1][3];
        boolean x = true;
        for (int i = 0, j = 0; i <= end-start; ++i) {
            c[i][j] = (char) (start+i);
            if (x) {
                ++j;
            } else {
                --j;
            }
            if ( (j == 2) || (j == 0) ) {
                x = !x;
            }
        }
        for (int j = 0; j < c[0].length; ++j) {
            for (int i = 0; i < c.length; ++i) {
                if ( c[i][j] == 0 ) {
                    c[i][j] = '.';
                }
                System.out.print( c[i][j] );
            }
            System.out.println();
        }
    }

}
