/*
 *
 */

package util;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.2.0
 *
 */

import java.io.File;

public class Runtime {

    private Runtime() {}

    public static String getCurrentJarName() {
        String[] classPath = System.getProperty("java.class.path").split(File.pathSeparator);
        String jarName = classPath[0];
        System.out.println("Classpath: " + jarName);
        if ( jarName.toLowerCase().endsWith(".jar") ) {
            return jarName;
        } else {
            return null;
        }
    }

    public static String getJarExecutionDirectory() {
        String jarFile, jarDirectory;
        int cutFileSeperator, cutSemicolon;
        jarFile = System.getProperty( "java.class.path" );

        // cut seperators
        cutFileSeperator = jarFile.lastIndexOf( System.getProperty( "file.separator" ));
        jarDirectory = jarFile.substring( 0, cutFileSeperator );

        // cut semicolons
        cutSemicolon = jarDirectory.lastIndexOf(';');
        jarDirectory = jarDirectory.substring( cutSemicolon+1, jarDirectory.length() );

        return jarDirectory+System.getProperty("file.separator");
    }

}
