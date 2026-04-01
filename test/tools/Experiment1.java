package tools;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.0
 *
 */

import java.util.Random;

public class Experiment1 {

    // true : Kopf
    // false: Zahl

    private static int glob = 0;

    public static void main(String[] args) {
        boolean[] coins = new boolean[100];
        Random rand = new Random();
        for (int j = 0; j < 10000; ++j) {
            for (int i = 0; i < coins.length; ++i) {
                coins[i] = rand.nextBoolean();
            }
            int counter = 1;
            for (int i = 1; i < coins.length; ++i) {
                if ( coins[i-1] == coins[i] ) {
                    ++counter;
                } else {
                    counter = 1;
                }
                if ( counter == 6 ) {
                    ++glob;
                    System.out.println( glob + "mal 6er-Folge!" );
                    counter = 1;
                }
            }
        }
        System.out.println( glob/10000.0*100.0 + "% Chance auf eine 6er Reihe in diesem Lauf.");
    }

}
