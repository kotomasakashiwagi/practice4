package question;

import printers.Printer;
import scanners.IntScanner;
import utilitylist.UtilityOfList;

import java.util.InputMismatchException;
import java.util.List;

public class Question9 implements Question {
    @Override
    public void run() {
        try {
            List<Integer> integerList = IntScanner.scanTenNumbers();
            int max = UtilityOfList.calculateMaxInList(integerList);
            int min = UtilityOfList.calculateMinInList(integerList);
            Printer.printMaxAndMin(max, min);

        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        }
    }
}
