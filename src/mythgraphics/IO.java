/*
 * IO.java
 *
 * Created on 24. Juni 2009, 18:09
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package mythgraphics;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.1
 *
 */

public class IO {
    
    private IO() {}

    /**
     * Generiert aus dem Programm-Namen einen String, der einen benutzerspezifischen, allgemeinen
     * Standard-Pfad für programmspezifische Daten zurück gibt, der Daten wie Einstellungen,
     * Logbücher, temporäre Dateien usw. gedacht ist.
     *
     * Der Rückgabe-String endet mit dem OS-spezifischen Datei-Separator ("/" unter Linux,
     * "\" unter Windows)
     *
     * @param programName Der Name des aufrufenden Programms oder ein ihm spezifischer Identifier.
     * @return Der relative Standard-Pfad als String-Objekt.
     */
    public static String getStandardPath(String programName) {
        String separator = System.getProperty("file.separator");
        return ".mythgraphics" + separator + programName + separator;
    }
    
}
