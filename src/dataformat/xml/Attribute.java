/*
 * Attribute.java
 *
 * Created on 29. September 2007, 02:30
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package dataformat.xml;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 2.0.1
 *
 */

public class Attribute {

    private final Describable d;
    public final String name;
    private String value;

    public Attribute(Describable d, String name, String value) {
        this.d = d;
        this.name  = name;
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name + d.getAttributeLeader() + value + d.getAttributeTail();
    }

}
