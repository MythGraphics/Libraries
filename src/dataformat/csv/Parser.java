/*
 *
 */

package dataformat.csv;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.1.0
 *
 */

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Parser {

    public static final String SEPARATORS = ",; \t";

    private final String separators;
    private final boolean retDelims;

    public Parser() {
        this(SEPARATORS, false);
    }

    public Parser(String separators, boolean returnDelims) {
        this.separators = separators;
        this.retDelims  = returnDelims;
    }

    public String getSeparators() {
        return separators;
    }

    public ArrayList<String> parseln(String str) {
        ArrayList<String> list = new ArrayList<>();
        StringTokenizer t = new StringTokenizer( str, separators, retDelims );
        while ( t.hasMoreElements() ) {
            list.add( t.nextToken() );
        }
        return list;
    }

}
