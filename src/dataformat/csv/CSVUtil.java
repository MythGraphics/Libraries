/*
 *
 */

package dataformat.csv;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.1
 *
 */

import java.util.ArrayList;

public class CSVUtil {

    // Utility-Klasse
    private CSVUtil() {}

    public static ArrayList<String> getColumnByName(
        ArrayList<ArrayList<String>> dataset,
        ArrayList<String> header,
        String name
    ) {
        ArrayList<String> col = new ArrayList<>();
        int i = 0;
        for (; i < header.size(); ++i) {
            if ( header.get(i).equals(name) ) {
                break;
            }
        }
        if ( i >= header.size() ) {
            return null;
        }
        for (int a = 0; a < dataset.size(); ++a) {
            for (int b = 0; b < dataset.get(a).size(); ++b) {
                if (b == i) {
                    col.add( dataset.get(a).get(b) );
        }}}
        return col;
    }

    public static String getValueByName(ArrayList<String> list, ArrayList<String> header, String name) {
        for (int i = 0; i < header.size(); ++i) {
            if ( header.get(i).equals(name) ) {
                return list.get(i);
        }}
        return null;
    }

}
