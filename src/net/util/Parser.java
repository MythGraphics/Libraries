/*
 * Parser.java
 *
 * Created on 2. März 2008, 06:41
 *
 */

package net.util;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 2.0.0
 *
 */

import java.net.MalformedURLException;
import java.net.UnknownHostException;
import net.Login;
import net.ServiceAddress;

public class Parser {

    private Parser() {}

    public static String getProtocolTag(String s) {
        if ( s.contains("://") )
            return s.substring( 0, s.indexOf("://") );
        else
            return null;
    }

    public static String removeProtocolTag(String s) {
        if ( s.contains("://") ) {
            s = s.substring( s.indexOf("://")+3 );
        }
        if ( s.endsWith("/") ) {
            s = s.substring( 0, s.length()-1 );
        }
        return s;
    }

    public static Login getLogin(String url) throws MalformedURLException {
        return new Login(url);
    }

    public static ServiceAddress getServiceAddress(String url) throws UnknownHostException, MalformedURLException {
        return new ServiceAddress(url);
    }

}
