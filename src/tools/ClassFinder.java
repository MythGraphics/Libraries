package tools;

import java.io.File;
import java.io.IOException;

public class ClassFinder {

    public static void main(String[] args) {
        File f = new File(args[0]);
        String name = f.getName();
        String path = f.getParent();
        name = name.substring(0, name.length()-6); // entfernt die Dateiendung (.class)
        try {
            java.lang.Runtime.getRuntime().exec("cmd.exe /C classfile.bat " + path + " " + name);
        }
        catch (IOException e) { e.printStackTrace(); }
    }

}
