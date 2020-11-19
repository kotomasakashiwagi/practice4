package question;

import printers.SymbolPrinter;
import scanners.IntScanner;

import java.util.InputMismatchException;

public class Question21 implements Question {
    @Override
    public void run() {
        try {
            System.out.println("正の整数を入力してください。");
            int scanPositiveX = IntScanner.scanPositiveX();
            SymbolPrinter.printSymbolToCrossMark(scanPositiveX);
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
