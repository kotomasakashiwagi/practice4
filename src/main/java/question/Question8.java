package question;

import printers.Printer;
import scanners.IntScanner;
import utilitylist.UtilityOfList;

import java.util.InputMismatchException;
import java.util.List;

public class Question8 implements Question {
    @Override
    public void run() {
        try {
            List<Integer> tenPositiveNumberList = IntScanner.scanTenPositiveX();
            int i = UtilityOfList.calculateMaxInList(tenPositiveNumberList);
            Printer.printInt(i);
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
