import java.math.BigInteger;

public class FibonacciSequence {
    private static final int N = 1000;

    //フィボナッチ数列の次項を計算
    public static void fibonacciRecurrenceFormula(int a, int b, int n) {
        int sum = a + b;
        if (sum < n) {
            System.out.print(sum + " ");
            fibonacciRecurrenceFormula(b, sum, n);
        }
    }


}
