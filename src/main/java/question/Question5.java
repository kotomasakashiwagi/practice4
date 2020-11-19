package question;

import java.util.InputMismatchException;
import java.util.List;
import printers.Printer;
import scanners.IntScanner;
import utilitylist.UtilityOfList;

public class Question5 implements Question {
    @Override
    public void run() {
        try {
            List<Integer> tenNumberList = IntScanner.scanTenNumbers();
            int ave = UtilityOfList.calculateAverageOfList(tenNumberList);
            Printer.printInt(ave);
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        }
    }
}
