package question;

import printers.Printer;
import scanners.DoubleScanner;
import utilitylist.UtilityOfList;

import java.util.InputMismatchException;
import java.util.List;

public class Question19 implements Question {
    @Override
    public void run() {
        System.out.println("最初に0は入れずに0を入れるまで数字を入力してください。");
        System.out.println("例：\n30 \n40 \n20 \n0");
        try {
            List<Double> scanUntilZeroList = DoubleScanner.scanUntilZero();
            if (scanUntilZeroList.size() == 1) {
                System.err.println("最初に0は入れないでください。");
                System.exit(0);
            }
            double averageOfDoubleList = UtilityOfList.calculateAverageOfDoubleList(scanUntilZeroList);
            System.out.println("平均は");
            Printer.printDouble(averageOfDoubleList);
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        }
    }
}
