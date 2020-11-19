package question;

import scanners.BaseballCount;
import printers.Printer;

import java.util.InputMismatchException;

public class Question13 implements Question {
    @Override
    public void run() {
        try {
            String strikeOrBall = BaseballCount.countStrikeOrBall();
            Printer.printString(strikeOrBall);
        } catch (InputMismatchException e) {
            System.out.println("数字を入力してください。");
        }
    }
}
