public class Question22 implements Question {
    @Override
    public void run() {
        int first = 0;
        int second = 1;
        int N = 1000;
        System.out.print(first + " " + second + " ");
        FibonacciSequence.fibonacciRecurrenceFormula(first, second, N);
    }
}
