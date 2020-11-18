import java.util.List;

public class FibonacciSequence {
    private static final int N = 1000;

    //フィボナッチ数列の次項を計算
    public static void fibonacciRecurrenceFormula(int a, int b, int n, List<Integer> list) {
        int sum = a + b;
        if (sum < n) {
            UtilityOfList.AddToList(sum, list);
            fibonacciRecurrenceFormula(b, sum, n, list);
        }
    }


}
