/*
 *
 */

package dataformat.xml.html;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.1
 *
 */

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public abstract class AbstractHTMLFileMaker {

    public final static String DEFAULT_MARKER = "<!-- Data here -->";

    private String marker = DEFAULT_MARKER;
    private String leader = "";
    private ArrayList<String> lines;

    abstract File getTemplateFile();
    abstract File getTargetFile();
    abstract ArrayList<String> getHTMLContent();

    public void setMarker(String marker) {
        if (( marker == null ) || marker.isEmpty() ) {
            return;
        }
        this.marker = marker;
    }

    private void replaceInlineTemplate(ArrayList<String> template, ArrayList<String> replacement) {
        if ( template == null || template.isEmpty() ) { return; }
        if ( replacement == null || replacement.isEmpty() ) { return; }
        for (int j = 0; j < template.size(); ++j) {
            for (int i = 0; i < lines.size(); ++i) {
                if ( lines.get(i).contains( template.get(j) )) {
                    lines.set( i, lines.get(i).replace( template.get(j), replacement.get(j) ));
        }}}
    }

    public void make(ArrayList<String> inlineTemplate, ArrayList<String> inlineReplacement) throws IOException {
        readTemplate();
        replaceInlineTemplate(inlineTemplate, inlineReplacement);
        makeHTMLFile();
    }

    public void make() throws IOException {
        readTemplate();
        makeHTMLFile();
    }

    public String getLeader() {
        return leader;
    }

    public int getLeaderLength() {
        return leader.length();
    }

    private void readTemplate() throws IOException {
        String line;
        lines = new ArrayList<>();
        BufferedReader in = io.Reader.getTextReader( getTemplateFile() );
        while ( in.ready() ) {
            line = in.readLine();
            if ( line.contains(marker) ) {
                leader = line.substring( 0, line.indexOf('<') );
                for (String s : getHTMLContent() ) { lines.add( leader + s ); }
                continue; // Marker-Zeile überspringen -> keine Ausgabe
            }
            lines.add(line);
        }
        in.close();
    }

    private void makeHTMLFile() throws IOException {
        getTargetFile().createNewFile();
        PrintWriter out = io.Writer.getTextWriter( getTargetFile() );
        for (String s : lines) {
            out.println(s);
        }
        out.flush();
        out.close();
        try { Thread.sleep(500); }
        catch (InterruptedException e) {}
    }

    public void show() {
        try { Desktop.getDesktop().browse( getTargetFile().toURI() ); }
        catch (IOException e) { e.printStackTrace(); }
//      java.lang.Runtime.getRuntime().exec( BROWSER + " \"" + target.getAbsolutePath() + "\"" );
    }

}
