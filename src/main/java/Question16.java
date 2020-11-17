import java.util.InputMismatchException;
import java.util.List;

public class Question16 implements Question {
    @Override
    public void run() {
        System.out.println("2以上の整数を入力してください。");
        try {
            int i = IntScanner.scanXMoreThanTwo();
            List list = PrimeFactorization.primeFactorization(i);
            Printer.printList(list);
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
