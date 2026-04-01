/*
 *
 */

package dataformat.xml.html;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 4.0.0
 *
 */

import java.util.ArrayList;

public class Table {

    public final static String CAPTION_START    = "<caption>";
    public final static String CAPTION_END      = "</caption>";
    public final static String TABLE_START      = "<table>";
    public final static String TABLE_END        = "</table>";
    public final static String TABLEROW_START   = "<tr>";
    public final static String TABLEROW_END     = "</tr>";
    public final static String HEADERCELL_START = "<th>";
    public final static String HEADERCELL_END   = "</th>";
    public final static String CELL_START       = "<td>";
    public final static String CELL_END         = "</td>";
    public final static String SPACER           = "    ";

    private String caption;
    private String header;

    private final ArrayList<String> content = new ArrayList<>();

    public Table() {}

    public void addHeader(TableRow header) {
        this.header = header.toString();
    }

    public void addRow(TableRow content) {
        this.content.add( content.toString() );
    }

    public void addCaption(String caption) {
        this.caption = CAPTION_START + caption + CAPTION_END;
    }

    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append(TABLE_START).append("\n");
        if ( caption != null ) {
            builder.append(caption).append("\n");
        }
        if ( header != null ) {
            builder.append(header).append("\n");
        }
        for ( String con : content ) {
            builder.append(con).append("\n");
        }
        builder.append(TABLE_END).append("\n");
        return builder.toString();
    }

    @Override
    public String toString() {
        return build();
    }

}
