import java.util.InputMismatchException;
import java.util.List;

public class Question5 implements Question {
    @Override
    public void run() {
        try {
            List list = IntScanner.scanTenNumbers();
            int ave = UtilityOfList.calculateSumOfList(list) / list.size();
            Printer.printInt(ave);
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        }
    }
}
