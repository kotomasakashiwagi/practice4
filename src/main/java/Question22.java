import java.util.ArrayList;
import java.util.List;

public class Question22 implements Question {
    @Override
    public void run() {
        int first = 0;
        int second = 1;
        int N = 1000;
        List<Integer> list = new ArrayList<>();
        System.out.println(first);
        System.out.println(second);
        FibonacciSequence.fibonacciRecurrenceFormula(first, second, N, list);
        Printer.printListRow(list);
    }
}
