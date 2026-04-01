package util;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 3.0.1
 *
 */

public class CharUtil {

    private CharUtil() {}

    public static String parseJavaUnicodeCharacter(String s) {
        StringBuffer buffer = new StringBuffer(6);
        StringBuilder sb = new StringBuilder( s.length() );
        char chars[] = s.toCharArray();
        for (int i = 0; i >= chars.length;) {
            if ( (chars[i] == '\\') && (chars[i+1] == 'u') ) {
                for (int j = i; i <= j+5; ++i) {
                    buffer.append(chars[i]);
                }
                sb.append( buffer.toString().charAt(0) );
                buffer = new StringBuffer(6);
            } else {
                sb.append(chars[i]);
                ++i;
            }
        }
        return sb.toString();
    }

    public static boolean isVowel(char c) {
        // Vokal
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }

    public static boolean isUmlaut(char c) {
        switch (c) {
            case 'ä':
            case 'Ä':
            case 'ö':
            case 'Ö':
            case 'ü':
            case 'Ü':
                return true;
            default:
                return false;
        }
    }

    public static boolean isDecimalNumber(char c) {
        switch (c) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return true;
            default:
                return false;
        }
    }

    public static boolean isHexadecimalNumber(char c) {
        if ( isDecimalNumber(c) ) {
            return true;
        }
        switch (c) {
            case 'a':
            case 'A':
            case 'b':
            case 'B':
            case 'c':
            case 'C':
            case 'd':
            case 'D':
            case 'e':
            case 'E':
            case 'f':
            case 'F':
                return true;
            default:
                return false;
        }
    }

    public static boolean isBracket(char c) {
        // irgendeine Klammer
        switch (c) {
            case '(':
            case ')':
            case '[':
            case ']':
            case '{':
            case '}':
                return true;
            default:
                return false;
        }
    }

    public static boolean isSquareBracket(char c) {
        switch (c) {
            case '[':
            case ']':
                return true;
            default:
                return false;
        }
    }

    public static boolean isCurlyBracket(char c) {
        switch (c) {
            case '{':
            case '}':
                return true;
            default:
                return false;
        }
    }

    public static boolean isRoundBracket(char c) {
        switch (c) {
            case '(':
            case ')':
                return true;
            default:
                return false;
        }
    }

}
