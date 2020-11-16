import java.util.InputMismatchException;
import java.util.List;

public class Question9 implements Question {
    @Override
    public void run() {
        try {
            List list = IntScanner.scanTenNumbers();
            int max = UtilityOfList.calculateMaxInList(list);
            int min = UtilityOfList.calculateMinInList(list);
            Printer.printMaxAndMin(max, min);

        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        }
    }
}
