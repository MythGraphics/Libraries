/*
 *
 */

package util;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.1
 *
 */

public class Sorter {

    private Sorter() {}

    public static <T extends Comparable<? super T>> void bubblesort(T[] array) {
        int l = array.length;
        T t;
        for (int j = 0; j < l; ++j) {
            for (int i = 0; i < l-j; ++i) {
                if ( array[i].compareTo( array[i+1] ) > 0 ) {
                    t = array[i];
                    array[i] = array[i+1];
                    array[i+1] = t;
        }}}
    }

    public static <T extends Comparable<? super T>> void insertsort(T[] array) {
        /* Ein Array wird von vorne nach hinten durchlaufen.
         * Bei jedem Durchlauf wiederum in der entgegengesetzten Richtung.
         * Ist der Wert eines niedrigeren Elementes höher als derjenige eines höheren Elementes,
         * werden beide Elemente getauscht.
         */
        int l = array.length;
        T t;
        for (int i = 0; i < l; i++) {
            for (int j = l-1; j > 0; j--) {
                if ( array[j-1].compareTo( array[j] ) > 0 ) {
                    t = array[j];
                    array[j] = array[j-1];
                    array[j-1] = t;
        }}}
    }

    public static <T extends Comparable<? super T>> void shellsort(T[] array) {
        int j, l = array.length;
        T tmp;
        // Start with a big gap, then reduce the gap
        for (int gap = l/2; gap > 0; gap /= 2) {
            /* do a gapped insertion sort for this gap size.
             * The first gap elements a[0..gap-1] are already in gapped order
             * keep adding one more element until the entire array is
             * gap sorted
             */
            for (int i = gap; i < l; i++) {
                /* add a[i] to the elements that have been gap sorted
                 * save a[i] in temp and make a hole at position i
                 */
                tmp = array[i];
                /* shift earlier gap-sorted elements up until
                 * the correct location for a[i] is found
                 */
                for (j = i; j >= gap && tmp.compareTo( array[j-gap] ) < 0; j -= gap) {
                    array[j] = array[j-gap];
                }
                // put temp (the original a[i]) in its correct location
                array[j] = tmp;
            }
        }
    }

    public static <T extends Comparable<? super T>> void shakesort(T[] array) {
        int i = 0, l = array.length;
        T t;
        while (i < l) {
            for (int j = i; j < l-1; ++j) {
                if ( array[j].compareTo( array[j+1] ) > 0 ) {
                    t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
            --l;
            for (int j = l-1; j >= i; --j) {
                if ( array[j].compareTo( array[j+1] ) > 0 ) {
                    t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
            ++i;
        }
    }

    public static <T extends Comparable<? super T>> boolean isSorted(T[] array) {
        for (int i = 0; i < array.length-1; ++i) {
            if ( array[i].compareTo( array[i+1] ) > 0 ) {
                return false;
            }
        }
        return true;
    }

}
