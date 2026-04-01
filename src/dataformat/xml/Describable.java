/*
 * Describable.java
 *
 * Created on 15. Juni 2009, 17:51
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

public interface Describable {

    String getTagOpening();
    String getTagClosing();
    String getTagEndmark();
    String getAttributeLeader();
    String getAttributeTail();
    String getSeparator();

}
