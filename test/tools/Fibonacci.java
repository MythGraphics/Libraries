package tools;

public class Fibonacci {

    private Fibonacci() {}

    public static void main(String[] args) {
        int n = 20;
        for (int i = 2; i <= n; ++i) {
            System.out.println( fiboI(i) );
        }
    }

    /**
     * Berechnet Fibonacci-Zahl von n rekursiv
     * @param n die Zahl, zu der seine Fibonacci-Zahl berechnet werden soll
     * @return die Fibonacci-Zahl von n
     */
    public static int fiboR(int n) {
        if (n <= 2) {
            return 1;
        }
        return ( fiboR(n-1) + fiboR(n-2) );
    }

    /**
     * Berechnet Fibonacci-Zahl von n iterativ
     * @param n die Zahl, zu der seine Fibonacci-Zahl berechnet werden soll
     * @return die Fibonacci-Zahl von n
     */
    public static int fiboI(int n) {
        int x, a = 0, b = 1;
        for (int i = 1; i <= n; ++i) {
            x = a+b;
            a = b;
            b = x;
//          System.out.println(a);  /* Ausgabe aller Fibonacci-Zahlen
//                                     einschließlich fibo(n) */
        }
        return a;
    }

}
