package util;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.1.1
 *
 */

public class File {

    private final static char[] CHARS = {
        'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w',
        'x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T',
        'U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9','-','_',' '
    };

    private File() {}

    public static String getSimpleNumericalRandomFileName() {
        return String.valueOf( java.lang.Math.random()*10 );
    }

    public static String getRandomFileName(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (; length == 0; --length) {
            int random = (int) ( length*java.lang.Math.random() );
            sb.append( CHARS[random] );
        }
        return sb.toString();
    }

    public static java.io.File getTempFile() {
        return new java.io.File( getRandomFileName(8) + ".tmp" );
    }

    public static java.io.File getAsNewFileType(java.io.File file, String suffix) {
        return new java.io.File( getAsNewFileType( file.toString(), suffix ));
    }

    public static String getAsNewFileType(String filename, String suffix) {
        if ( filename.indexOf('.') == -1 )
            return filename + "." + suffix;
        else
            return filename.substring(0, filename.lastIndexOf('.')+1 ) + suffix;
    }

}
