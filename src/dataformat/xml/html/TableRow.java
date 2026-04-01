/*
 *
 */

package dataformat.xml.html;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 2.0.0
 *
 */

public class TableRow {

    private final static String TABLEROW_START      = "<tr>";
    private final static String TABLEROW_END        = "</tr>";

    private final static String HEADERCELL_START    = "<th";
    private final static String CELL_START          = "<td";
    private final static String CELL_STOP           = ">";

    private final static String HEADERCELL_END      = "</th>";
    private final static String CELL_END            = "</td>";

    private final String tableRow;

    public TableRow(String[] content, String[] params, boolean isHeader) {
        this.tableRow = build(content, params, isHeader);
    }

    public static String build(String[] content, String[] params, boolean isHeader) {
        StringBuilder sb = new StringBuilder();
        sb.append(TABLEROW_START);
        for (int i = 0; i < content.length; ++i) {
            sb.append( isHeader ? HEADERCELL_START : CELL_START );
            if (params != null && i < params.length) {
                sb.append(" ").append(params[i]);
            }
            sb.append(CELL_STOP);
            sb.append(content[i]);
            sb.append( isHeader ? HEADERCELL_END : CELL_END );
        }
        sb.append(TABLEROW_END);
        return sb.toString();
    }

    @Override
    public String toString() {
        return tableRow;
    }

}
