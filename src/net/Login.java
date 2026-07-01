/*
 *
 */

package net;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.2.1
 *
 */

import java.net.MalformedURLException;
import java.util.StringTokenizer;

public class Login {

    private final String user;
    private char[] pass = new char[0];

    public Login(String user, String pass) {
        this( user, pass.toCharArray() );
    }

    public Login(String user, char[] pass) {
        this.user = user;
        if (pass != null) {
            this.pass = pass;
        }
    }

    public Login(String url) throws MalformedURLException {
        if ( !url.contains(":") || !url.contains("@") ) {
            throw new MalformedURLException("No \":\" or \"@\" in URL-String");
        }
        int start, end;
        if (( start = url.indexOf("://") ) >= 0 ) {
            start += 3;
        } else {
            start  = 0;
        }
        if (( end = url.indexOf('@')-1 ) >= start ) {
            url = url.substring( start, end );
        }
        StringTokenizer tokenizer = new StringTokenizer( url, ":", false );
        user = tokenizer.nextToken();
        if ( tokenizer.hasMoreTokens() ) {
            pass = tokenizer.nextToken().toCharArray();
        }
    }

    public String getUser() {
        return user;
    }

    public boolean checkPass(String pass) {
        return this.pass.equals(pass);
    }

    public char[] getPass() {
        return pass;
    }

    public void setPass(char[] pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return user + ":" + String.valueOf(pass);
    }

}
