/*
 *
 */

package util;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 1.0.2
 *
 */

public class Shifter {

    private final String param;
    private final String[] args;

    private Shifter(String[] args, String param) {
        this.args  = args;
        this.param = param;
    }

    public String getParam() {
        return param;
    }

    public String[] getArgs() {
        return args;
    }

    public static Shifter getShift(String[] args, String token) {
        for ( int i = 0; i < args.length; ++i ) {
            if ( args[i].contains( token )) {
                String arg = args[i];
                return new Shifter( ArrayUtil.del(args, i, String.class), arg );
            }
        }
        return new Shifter( args, null );
    }

}
