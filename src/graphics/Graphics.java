/*
 *
 */

package graphics;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.0
 *
 */

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.RenderingHints;

public class Graphics {

    private Graphics() {}

    public static void setRenderingHints(Graphics2D g2d) {
        g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
    }

    public static void drawHexagon(Graphics2D g2d, int angle, Point p) {
        // (0, 0) oben links
        g2d.rotate( Math.toRadians(angle), p.getX(), p.getY() );
        g2d.fill( getRegularPolygon( p, 100, 6 ));
    }

    public final static Polygon getRegularPolygon(Point p, int size, int n) {
        Polygon poly = new Polygon();
        for (int i = 0; i < n; i++) {
            poly.addPoint(
                (int) ( p.x + size/2*Math.cos( i*2*Math.PI / n )),
                (int) ( p.y + size/2*Math.sin( i*2*Math.PI / n ))
            );
        }
        return poly;
    }

}
