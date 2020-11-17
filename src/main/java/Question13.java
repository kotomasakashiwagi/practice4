import java.util.InputMismatchException;

public class Question13 implements Question {
    @Override
    public void run() {
        try {
            String s = BaseballCount.countStrikeOrBall();
            Printer.printString(s);
        } catch (InputMismatchException e) {
            System.out.println("数字を入力してください。");
        }
    }
}
