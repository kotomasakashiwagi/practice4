package question;

import calculator.FibonacciSequence;
import printers.Printer;

import java.util.ArrayList;
import java.util.List;

public class Question22 implements Question {
    private static final int first = 0;
    private static final int second = 1;
    private static final int N = 1000;

    @Override
    public void run() {
        List<Integer> integerList = new ArrayList<>();
        System.out.println(first);
        System.out.println(second);
        FibonacciSequence.fibonacciRecurrenceFormula(first, second, N, integerList);
        Printer.printListRow(integerList);
    }
}
