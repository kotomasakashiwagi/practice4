package question;

import printers.Printer;
import scanners.DoubleScanner;
import utilitylist.UtilityOfList;

import java.util.InputMismatchException;
import java.util.List;

public class Question18 implements Question {
    @Override
    public void run() {
        System.out.println("0を入れるまで数字を入力してください。");
        System.out.println("例：\n30 \n40 \n20 \n0");
        try {
            List<Double> list = DoubleScanner.scanUntilZero();
            double sumOfDoubleList = UtilityOfList.calculateSumOfDoubleList(list);
            System.out.println("合計は");
            Printer.printDouble(sumOfDoubleList);
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        }
    }
}
