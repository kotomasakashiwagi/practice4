import java.util.InputMismatchException;
import java.util.List;

public class Question18 implements Question {
    @Override
    public void run() {
        System.out.println("0を入れるまで数字を入力してください。");
        System.out.println("例：\n30 \n40 \n20 \n0");
        try {
            List list = DoubleScanner.scanUntilZero();
            double d = UtilityOfList.calculateSumOfDoubleList(list);
            System.out.println("合計は");
            Printer.printDouble(d);
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        }
    }
}
