import java.math.BigInteger;

public class FibonacciSequence {
    private static final int N = 1000;

    static int count = 0;

    public static void fibonacciRecurrenceFormula(long a, long b, int n) {
        while (count < n) {
            long sum = a + b;
            System.out.print(sum + " ");
            count++;
            fibonacciRecurrenceFormula(b, sum, n);
        }
    }


}
