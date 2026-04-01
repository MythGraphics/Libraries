/*
 *
 */

package util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 2.1.0
 *
 */

public class MathUtil {

    private MathUtil() {}

    public static boolean isEven(int a) {
        return ( ((a/2)*2) == a );
    }

    public static double round(double x, int digits) {
        double f = 10 * digits;
        return java.lang.Math.round( x * f ) / f;
//      return BigDecimal.valueOf(x).setScale( digits, RoundingMode.HALF_UP ).doubleValue();
    }

    public static double roundStatistic(double x, int digits) {
        return BigDecimal.valueOf(x).setScale( digits, RoundingMode.HALF_EVEN ).doubleValue();
    }

}
