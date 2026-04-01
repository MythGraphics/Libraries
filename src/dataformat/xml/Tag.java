/*
 * Tag.java
 *
 * Created on 27. Dezember 2007, 23:55
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

public class Tag {

    private final String name;
    final Describable d;

    public Tag(Describable d, String name) {
        this.d = d;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getOpeningTag() {
        return d.getTagOpening() + name + d.getTagClosing();
    }

    public String getClosingTag() {
        return d.getTagOpening() + d.getTagEndmark() + name + d.getTagClosing();
    }

    @Override
    public String toString() {
        return getOpeningTag() + getClosingTag();
    }

}
