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

public class SingleTag extends Tag {

    public SingleTag(Describable d, String name) {
        super(d, name);
    }

    @Override
    public String getOpeningTag() {
        return super.d.getTagOpening() + super.getName() + " " + super.d.getTagEndmark() + super.d.getTagClosing();
    }

    @Override
    public String getClosingTag() {
        return "";
    }

}
