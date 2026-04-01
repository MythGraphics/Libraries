/*
 * AttributedElement.java
 *
 * Created on 28. Dezember 2007, 01:22
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

public class AttributedElement extends Element {

    private final Attribute[] atbs;

    public AttributedElement(Element e, Attribute[] atbs) {
        super(e);
        this.atbs = atbs;
    }

    public Attribute[] getAttributes() {
        return atbs;
    }

    public Attribute getAttribute(int index) {
        return atbs[index];
    }

    @Override
    public String getOpeningTag() {
        if (atbs == null) {
            return super.getOpeningTag();
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < atbs.length; ++i) {
            if (atbs[i] == null) {continue;}
            sb.append( super.d.getSeparator() );
            sb.append( atbs[i].toString() );
        }
        return super.d.getTagOpening() + super.getName() + sb.toString() + super.d.getTagClosing();
    }

    public static Attribute[] getArray(Describable d, String[] names, String[] values) {
        Attribute[] a = new Attribute[names.length];
        String x;
        for (int i = 0; i < names.length; ++i) {
            if ( (values[i] == null) || values[i].isEmpty() ) {
                x = "";
            } else {
                x = values[i];
            }
            a[i] = new Attribute( d, names[i], x );
        }
        return a;
    }

}
