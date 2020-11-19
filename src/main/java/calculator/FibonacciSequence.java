package calculator;

import utilitylist.UtilityOfList;

import java.util.List;

public class FibonacciSequence {
    private static final int N = 1000;

    //フィボナッチ数列の次項を計算
    public static void fibonacciRecurrenceFormula(int an, int anPlus1, int upperLimit,
                                                  List<Integer> fibonacciList) {
        int sum = an + anPlus1;
        if (sum < upperLimit) {
            UtilityOfList.AddToList(sum, fibonacciList);
            fibonacciRecurrenceFormula(anPlus1, sum, upperLimit, fibonacciList);
        }
    }


}
