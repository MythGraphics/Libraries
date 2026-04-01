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

import java.io.File;
import java.util.ArrayList;

public class HTMLFileMaker extends AbstractHTMLFileMaker {

    public final static String TEMPLATE = "vorlage.html";
    public final static String TARGET   = "target.html";

    private final File template, target;

    private final ArrayList<String> htmlContent;

    public HTMLFileMaker(ArrayList<String> htmlContent) {
        this(htmlContent, AbstractHTMLFileMaker.DEFAULT_MARKER);
    }

    public HTMLFileMaker(ArrayList<String> htmlContent, String marker) {
        this(htmlContent, AbstractHTMLFileMaker.DEFAULT_MARKER, TEMPLATE, TARGET);
    }

    public HTMLFileMaker(ArrayList<String> htmlContent, String marker, String template, String target) {
        this.template       = new File(template);
        this.target         = new File(target);
        this.htmlContent    = htmlContent;
        super.setMarker(marker);
    }

    @Override
    public File getTemplateFile() {
        return template;
    }

    @Override
    public File getTargetFile() {
        return target;
    }

    @Override
    public ArrayList<String> getHTMLContent() {
        return htmlContent;
    }

}
