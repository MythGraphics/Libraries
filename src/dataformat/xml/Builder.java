/*
 *
 */

package dataformat.xml;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.0
 *
 */

public class Builder {

    private final StringBuffer line = new StringBuffer();

    public Builder() {}

    public void add(Tag t) {
        line.append( t.toString() );
    }

    public void add(Element e) {
        line.append( e.toString() );
    }

    public void add(AttributedElement ae) {
        line.append( ae.toString() );
    }

    @Override
    public String toString() {
        return line.toString();
    }

}
