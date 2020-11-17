import java.util.InputMismatchException;

public class Question14 implements Question {
    @Override
    public void run() {
        try {
            String s = BaseballCount.countStrikeBallFoul();
            Printer.printString(s);
        } catch (InputMismatchException e) {
            System.out.println("数字を入力してください。");
        }
    }
}
