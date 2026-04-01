package tools;

public class Geldspiel {

    private Geldspiel() {}

    public static void main(String[] args) {
        for (int i = 1, x = 1, y = 1; i <= 30; ++i) {
            System.out.println( "Tag " + i );
            System.out.println( "Geld erhalten: " + x + " Euro" );
            System.out.println( "Vermögen: " + y + " Euro" );
            System.out.println();
            x *= 2;
            y += x;
        }
        System.out.println( (int)Math.pow(2.0, 29.0) + " = 2^29" );
        System.out.println( (int)Math.pow(2.0, 30.0)-1 + " = (2^30)-1" );
    }

}
