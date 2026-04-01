/*
 * Parser.java
 *
 * Created on 29. September 2007, 02:11
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package dataformat.xml;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 2.0.2
 *
 */

import java.util.StringTokenizer;
import java.util.NoSuchElementException;

public class Parser {

    private final static Describable XML = new Descriptor();

    public static String getContent(String string) {
        // entfernt exakt ein Tag-Paar
        return getElement(string).getContent();
    }

    public static Element getElement(String string) {
        /* baut aus Tag-Paar und Inhalt ein Element-Objekt
         * Unterstützt KEINE Attribut-Auflösung
         */
        String content = "";
        String tagstr  = string.substring( 1, string.indexOf(' ') );                                // 2. Zeichen bis 1. Leerzeichen
        int startcontent = string.indexOf(">") + 1;
        int endcontent   = string.lastIndexOf("<");
        if (startcontent < endcontent) {
            content = string.substring(startcontent, endcontent);
        }
        return new Element(XML, tagstr, content);
    }

    public static AttributedElement getAttributedElement(String string) {
        // baut aus Tag-Paar mit Attributen und Inhalt ein AttributedElement-Objekt
        Element e = getElement(string);
        String cutstr = string.substring( 0, string.indexOf(">") );
        StringTokenizer t = new StringTokenizer(cutstr, " ", false);
        t.nextToken();                                                                              // 1. Treffer verwerfen (OpeningTag)
        Attribute[] atbs = new Attribute[ t.countTokens() ];
        String s;
        for (int i = 0; t.hasMoreTokens(); ++i) {
            s = t.nextToken();
            while ( !s.endsWith("\"") && t.hasMoreTokens() ) {                                      // Leerzeichen innerhalb der Attribute wiederherstellen
                s += " " + t.nextToken();
            }
            atbs[i] = parseAttributeString(s);
        }
        return new AttributedElement(e , atbs);
    }

    public static Attribute parseAttributeString(String string) {
        if ( !string.contains("=\"") )
            return new Attribute(XML, string, "");
        else {
            String name  = string.substring( 0, string.indexOf("=\"") );
            String value = string.substring( string.indexOf("=\"")+2, string.lastIndexOf("\"") );
            return new Attribute(XML, name, value);
        }
    }

    public static boolean containsTags(String string) {
        // prüft, ob Tag-Paar! enthalten ist
        StringTokenizer t = new StringTokenizer(string, "<>", true);
        String endTag;
        try { endTag = t.nextToken() + "/" + t.nextToken() + t.nextToken(); }
        catch (NoSuchElementException e) {return false;}
        return string.contains(endTag);
    }

}
