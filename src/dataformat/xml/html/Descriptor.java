/*
 *
 */

package dataformat.xml.html;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.2.0
 *
 */

import dataformat.xml.Describable;

public class Descriptor implements Describable {

    private final static String OPEN        = "<";
    private final static String CLOSE       = ">";
    private final static String ENDMARK     = "/";
    private final static String LEADER      = "=\"";
    private final static String TAIL        = "\"";
    private final static String SEPARATOR   = " ";

    public Descriptor() {}

    @Override
    public String getTagOpening() {
        return OPEN;
    }

    @Override
    public String getTagClosing() {
        return CLOSE;
    }

    @Override
    public String getTagEndmark() {
        return ENDMARK;
    }

    @Override
    public String getAttributeLeader() {
        return LEADER;
    }

    @Override
    public String getAttributeTail() {
        return TAIL;
    }

    @Override
    public String getSeparator() {
        return SEPARATOR;
    }

}
