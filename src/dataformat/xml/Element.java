/*
 * Element.java
 *
 * Created on 29. September 2007, 02:29
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package dataformat.xml;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 2.1.0
 *
 */

public class Element extends Tag {

    private String content;

    public Element(Describable d, String name) {
        super(d, name);
    }

    public Element(Describable d, String name, String content) {
        this(d, name);
        this.content = content;
    }

    public Element(Element e) {
        this( e.d, e.getName(), e.getContent() );
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        if (content == null) {
            return getOpeningTag() + getClosingTag();
        } else {
            return getOpeningTag() + content + getClosingTag();
        }
    }

}
