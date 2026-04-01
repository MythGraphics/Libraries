/*
 *
 */

package gui;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.1
 *
 */

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ColorableJTable extends JTable {

    private Color[][] colorArray;

    public ColorableJTable() {
        super();
        colorArray = new Color[super.getRowCount()][super.getColumnCount()];
        super.setDefaultRenderer(Object.class, new ColoringCellRenderer());
    }

    public void setColorArray(Color[][] colorArray) {
        this.colorArray = colorArray;
    }

    public void setCellBackgroundColor(Color color, int row, int col) {
        colorArray[row][col] = color;
    }

    public Color getCellBackgroundColor(int row, int col) {
        return colorArray[row][col];
    }

    class ColoringCellRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
            if ( colorArray[row][col] != null ) {
                super.setBackground( getColor( colorArray[row][col], row ));
            } else {
                super.setBackground( getDefaultColor( row ));
            }
            return this;
        }
        private Color getDefaultColor(int row) {
            if ( row%2 == 0 ) {
                return Color.WHITE;
            }
            return util.ColorLibrary.LIGHT_GRAY;
        }
        private Color getColor(Color color, int row) {
            if ( row%2 == 0 ) {
                return color.brighter();
            }
            return color;
        }
    }

}
