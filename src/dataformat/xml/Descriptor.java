/*
 * Descriptor.java
 *
 * Created on 13. Juni 2009, 19:39
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package dataformat.xml;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.2.0
 *
 */

public class Descriptor implements Describable {

    public final static String OPEN         = "<";
    public final static String CLOSE        = ">";
    public final static String ENDMARK      = "/";
    public final static String LEADER       = "=\"";
    public final static String TAIL         = "\"";
    public final static String SEPARATOR    = " ";

    private String open;
    private String close;
    private String endmark;
    private String leader;
    private String tail;
    private String separator;

    public Descriptor() {
        init( OPEN, CLOSE, ENDMARK, LEADER, TAIL, SEPARATOR );
    }

    public Descriptor(String open, String close, String endmark, String leader, String tail, String separator) {
        init( open, close, endmark, leader, tail, separator );
    }

    private void init(String open, String close, String endmark, String leader, String tail, String separator) {
        this.open       = open;
        this.close      = close;
        this.endmark    = endmark;
        this.leader     = leader;
        this.tail       = tail;
        this.separator  = separator;
    }

    @Override
    public String getTagOpening() {
        return open;
    }

    @Override
    public String getTagClosing() {
        return close;
    }

    @Override
    public String getTagEndmark() {
        return endmark;
    }

    @Override
    public String getAttributeLeader() {
        return leader;
    }

    @Override
    public String getAttributeTail() {
        return tail;
    }

    @Override
    public String getSeparator() {
        return separator;
    }

}
