/*
 *
 */

package net.util;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 2.0.3
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.StringTokenizer;

public class IPAddress {

    private IPAddress() {}

    public static boolean isPartOfNetwork(boolean[] network, boolean[] netmask, boolean[] addr) {
        int i = 0; // Länge des Netzteils
        for (; i < network.length; ++i) {
            if (netmask[i] != true) {
                --i;
                break;
            }
        }
        for (int j = 0; j <= i; ++j) {
            if (network[j] != addr[j]) {
                return false;
            }
        }
        return true;
    }

    public static int toInteger(String addr) {
        int value;
        StringTokenizer t = new StringTokenizer(addr, ".", false);
        value  = Integer.valueOf( Integer.parseInt( t.nextToken() )) << 24;
        value |= Integer.valueOf( Integer.parseInt( t.nextToken() )) << 16;
        value |= Integer.valueOf( Integer.parseInt( t.nextToken() )) << 8;
        value |= Integer.parseInt( t.nextToken() );
        return value;
    }

    public static int toInteger(byte[] addr) {
        int value;
        value  = addr[0] << 24;
        value |= addr[1] << 16;
        value |= addr[2] << 8;
        value |= addr[3];
        return value;
    }

    public static int toInteger(InetAddress addr) {
        return toInteger( addr.getAddress() );
    }

    public static int[] toIntegerArray(String addr) {
        int value[] = new int[4];
        StringTokenizer t = new StringTokenizer(addr, ".", false);
        for (int i = 0; i < value.length; ++i) {
            value[i] = Integer.parseInt( t.nextToken() );
        }
        return value;
    }

    private static String addLeadingZeros(StringBuffer sb, int length) {
        while ( sb.length() != length ) {
            sb = sb.insert(0, 0);
        }
        return sb.toString();
    }

    private static String addLeadingZeros(String s, int length) {
        return addLeadingZeros( new StringBuffer(s), length );
    }

    public static String toBinaryString(int i) {
        return toBinaryString(i, 32);
    }

    public static String toBinaryString(int i, int counts) {
        return addLeadingZeros( Integer.toBinaryString(i), counts );
    }

    public static String toBinaryString(byte b) {
        return addLeadingZeros( Integer.toBinaryString( Byte.valueOf(b).intValue() ), 8);
    }

    public static boolean[] toBooleanArray(String binaddr) {
        boolean value[] = new boolean[32];
        for (int i = 0; i < value.length; ++i) {
            value[i] = binaddr.charAt(i) == '1';
        }
        return value;
    }

    public static boolean[] toBooleanArray(int i) {
        String binaddr = Integer.toBinaryString(i);
        return toBooleanArray(binaddr);
    }

    public static String getPublicIPAddress() {
        BufferedReader reader = null;
        StringTokenizer tokenizer;
        String s = "";
        try {
            reader = io.ReaderFactory.getTextReader( new URL("http://checkip.dyndns.org/") );
            tokenizer = new StringTokenizer( reader.readLine().substring( 76 ), "<", false );
            s = tokenizer.nextToken();
        }
        catch (IOException e) { e.printStackTrace(); }
        try {
            if (reader != null) {
                reader.close();
            }
        }
        catch (IOException e) { e.printStackTrace(); }
        return s;
    }

    public static String getIPAddress(int index) throws UnknownHostException {
        InetAddress a[];
        a = InetAddress.getAllByName( InetAddress.getLocalHost().getHostName() );
        if (index >= a.length) {
            throw new UnknownHostException("Index ungültig");
        }
        return a[index].getHostAddress();
    }

}
