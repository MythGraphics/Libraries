/*
 *
 */

package util;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 3.0.0
 *
 */

public class ArrayUtil {

    private ArrayUtil() {}

    /**
     * Entfernt den ersten Eintrag und setzt ihn wieder ans Ende (Rotation der Einträge).
     *
     * @param args
     */
    public static <T> void circle(T[] args) {
        int l = args.length;
        T t = args[0];
        for (int i = 0; i < l-1; ++i) {
            args[i] = args[i+1];
        }
        args[l-1] = t;
    }

    /**
     * Entfernt einen Eintrag.
     *
     * @param args
     * @param rmIndex Index des zu entfernenden Eintrags
     * @param klasse Klasse der ArrayUtil-Elemente
     * @return das neue String-ArrayUtil
     */
    public static <T> T[] del(T[] args, int rmIndex, Class klasse) {
        T[] a = (T[]) java.lang.reflect.Array.newInstance(klasse, args.length-1);
        for (int i = 0, j = 0; i < args.length; ++i) {
            if (i == rmIndex) {continue;}
            a[j] = args[i];
            ++j;
        }
        return a;
    }

    /**
     * Entfernt NULL und schneidet das ArrayUtil auf Länge.
     * @param <T>
     * @param array
     * @param klasse Klasse der ArrayUtil-Elemente
     * @return das neue ArrayUtil
     */
    public static <T> T[] trim(T[] array, Class klasse) {
        int length = 0, j = 0;
        for (Object o : array) {
            if (o != null) {++length;}
        }
        T[] a = (T[]) java.lang.reflect.Array.newInstance(klasse, length);
        for (int i = 0; i < array.length; ++i) {
            if ( array[i] != null) {
                a[j] = array[i];
                ++j;
            }
        }
        return a;
    }

    public static String[] shift(String[] args, int rmIndex) {
        if (rmIndex >= args.length) {
            return args;
        }
        String[] value = new String[args.length-1];
        int out = 0;
        for (int in = 0; in < value.length; ++in) {
            if (in == rmIndex) {
                continue;
            }
            ++out;
            value[out] = args[in];
        }
        return value;
    }

}
