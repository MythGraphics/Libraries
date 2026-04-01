package util;

/*
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.1.0
 *
 */

public class Average {

    public static final int ARITHMTIC_AVERAGE = 1;
    public static final int GEOMETRIC_AVERAGE = 2;

    private Average() {}

    public static double getAverage(double[] data, int type) {
        // alle null-Werte werden ignoriert
        switch (type) {
            case 1:
                return getArithmAvg(data);
            case 2:
                return getGeomAvg(data);
            default:
                return Double.NaN;
        }
    }

    public static double getArithmAvg(double[] data) {
        double value = 0.0;
        int counter = 0;
        for (double current : data) {
            if (current != 0) {
                value += current;
                ++counter;
            }
        }
        value /= counter;
        return value;
    }

    public static double getGeomAvg(double[] data) {
        double value = 1.0;
        int counter = 1;
        for (double current : data) {
            if (current != 0) {
                value *= current;
                ++counter;
            }
        }
        value = Math.pow(value, 1.0/counter);
        return value;
    }

}
