/*
 *
 */

package util;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.1.2
 *
 */

import java.net.*;
import java.util.Collections;
import java.util.Enumeration;

public class Net {

    private Net() {}

    public static String getFileName(URL url) {
        String s = url.toString();
        int i = s.lastIndexOf('/');
        return s.substring(i+1);
    }

    public static String getLocalIpAddress() {
        return getLocalIpAddress(null);
    }

    public static String getLocalIpAddress(String pattern) {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            String[] patternArray = { pattern, "192.168.", "10.", "172." };
            for (String s : patternArray) {
                String ip = filterHostAddress(interfaces, s);
                if (ip != null) {
                    return ip;
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
        // Fallback, falls gar nichts gefunden wurde
        return "127.0.0.1";
    }

    public static String filterHostAddress(Enumeration<NetworkInterface> interfaces, String pattern) throws SocketException {
        if (pattern == null || pattern.length() <= 0) {
            return null;
        }

        for ( NetworkInterface netInterface : Collections.list( interfaces )) {
            // Ignoriere inaktive Schnittstellen, Loopbacks und virtuelle Docker/VM-Adapter
            if ( !netInterface.isUp() || netInterface.isLoopback() || netInterface.isVirtual() ) {
                continue;
            }

            Enumeration<InetAddress> addresses = netInterface.getInetAddresses();
            for ( InetAddress addr : Collections.list( addresses )) {
                // nur eine echte IPv4-Adresse
                if ( addr instanceof Inet4Address && !addr.isLoopbackAddress() && !addr.isLinkLocalAddress() ) {
                    String hostAddress = addr.getHostAddress();
                    // filtern
                    if ( hostAddress.startsWith( pattern )) {
                        return hostAddress;
                    }
                }
            }
        }
        return null;
    }

}
