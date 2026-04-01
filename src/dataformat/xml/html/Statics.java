/*
 *
 */

package dataformat.xml.html;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.1
 *
 */

import dataformat.xml.Element;

public class Statics {

    private final static Descriptor D = new Descriptor();

    public final static Element TABLE               = new Element(D, "table");
    public final static Element TABLE_ROW           = new Element(D, "tr");
    public final static Element TABLE_HEADER_CELL   = new Element(D, "th");
    public final static Element TABLE_DATA_CELL     = new Element(D, "td");
    public final static Element CAPTION             = new Element(D, "caption");
    public final static Element NEWLINE             = new Element(D, "br /");

    private Statics() {}

}
