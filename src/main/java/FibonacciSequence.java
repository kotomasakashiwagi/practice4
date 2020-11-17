import java.math.BigInteger;

public class FibonacciSequence {
    private static final int N = 1000;

    static int count = 0;

    public static void fibonacciRecurrenceFormula(int a, int b, int n) {
        int sum = a + b;
        if (sum < n) {
            System.out.print(sum + " ");
            fibonacciRecurrenceFormula(b, sum, n);
        }
    }


}
