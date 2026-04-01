/*
 *
 */

package util;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 2.0.0
 *
 */

import java.awt.Color;

public class ColorCalculator {

    private final char[] chara;     // CharArray
    private final Color[] colors;   // SourceColorArray
    private final int quot;         // Quotient Chars/Farben
    private int index = 0;          // CharIndex
    private int ci = 0, cci = 0;    // ColorIndex, ColorCoIndex

    public ColorCalculator(Color[] colors, String str) {
        chara = str.toCharArray();
        this.colors = colors;
        this.quot = chara.length / ( colors.length - 1 );
    }

    public Color[] getColors() {
        Color[] c = new Color[chara.length];
        while (index < chara.length) {
            c[index] = nextColor();
        }
        return c;
    }

    public char[] getChars() {
        return chara;
    }

    public boolean hasMoreElements() {
        return (index < chara.length);
    }

    /**
     * Returns the length of the char array represented by this object
     * @return size of the char array
     */
    public int getSize() {
        return chara.length;
    }

    public char getCurrentChar() {
        return chara[index-1];
    }

    public Color nextColor() {
        int r, g, b;
        int RedCoEff, GreenCoEff, BlueCoEff; // Farb-Co-Effizienten

        RedCoEff   = ( colors[ci+1].getRed()   - colors[ci].getRed()   ) / quot;
        GreenCoEff = ( colors[ci+1].getGreen() - colors[ci].getGreen() ) / quot;
        BlueCoEff  = ( colors[ci+1].getBlue()  - colors[ci].getBlue()  ) / quot;
        r = colors[ci].getRed()   + RedCoEff  *cci;
        g = colors[ci].getGreen() + GreenCoEff*cci;
        b = colors[ci].getBlue()  + BlueCoEff *cci;
/*
 *      // old(er) implementation
 *
 *      RedCoEff   = ( colors[ci+1].getRed()   - colors[ci].getRed()   ) / chara.length;
 *      GreenCoEff = ( colors[ci+1].getGreen() - colors[ci].getGreen() ) / chara.length;
 *      BlueCoEff  = ( colors[ci+1].getBlue()  - colors[ci].getBlue()  ) / chara.length;
 *      r = colors[ci].getRed()   + RedCoEff  *index;
 *      g = colors[ci].getGreen() + GreenCoEff*index;
 *      b = colors[ci].getBlue()  + BlueCoEff *index;
 */
        ++index;
        ++cci;
        if (( index == quot*(ci+1) ) && ( ci+1 < colors.length-1 )) {
            ++ci;
            cci = 0;
        }

        Color color = new Color( r << 16 | g << 8 | b );
        System.out.println(
            ColorLibrary.colorToHexString( color ) +
            " --> " +
            this.getCurrentChar()
        );
        return color;
    }

}
