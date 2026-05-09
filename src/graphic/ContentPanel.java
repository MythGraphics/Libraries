/*
 *
 */

package graphic;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.0
 *
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class ContentPanel extends JPanel {

    private Graphics2D g2d;
    private Point maus;

    public ContentPanel(int width, int hight) {
        super.setSize(width, hight);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g2d = (Graphics2D) g;
        maus = super.getMousePosition();
        // ToDo hier weiter
    }

    public void drawBackground(Graphics2D g2d, BufferedImage bgImage) {
        if (bgImage == null) { return; }
        for (int x = 0; x < this.getWidth(); x += 100) {
            for (int y = 0; y < this.getHeight(); y += 100) {
                g2d.drawImage(bgImage, x, y, 100, 100, null);
            }
        }
    }

}
