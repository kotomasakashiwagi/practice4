import java.util.InputMismatchException;
import java.util.List;

public class Question8 implements Question {
    @Override
    public void run() {
        try {
            List list = IntScanner.scanTenPositiveX();
            int i = UtilityOfList.calculateMaxInList(list);
            Printer.printInt(i);
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
