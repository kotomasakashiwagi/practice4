import java.util.InputMismatchException;

public class Question12 implements Question {
    @Override
    public void run() {
        System.out.println("100を超えるまで数字を入力してください。");
        System.out.println("例：\n30 \n40 \n20 \n50");
        try {
            int i = UtilityOfList.calculateSumOfListUnderHundred();
            Printer.printInt(i);
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        }
    }
}
