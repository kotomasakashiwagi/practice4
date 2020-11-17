import java.util.InputMismatchException;

public class Question11 implements Question {
    @Override
    public void run() {
        System.out.println("正の数字を入れてください");
        try {
            int i = IntScanner.scanPositiveX();
            Printer.printListRepeatedly(i);
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}