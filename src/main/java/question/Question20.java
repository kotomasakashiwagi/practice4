package question;

import printers.Printer;
import scanners.IntScanner;

public class Question20 implements Question {
    @Override
    public void run() {
        System.out.println("正の整数を入力してください。");
        int scanPositiveX = IntScanner.scanPositiveX();
        for (int i = 1; i <= scanPositiveX; i++) {
            Printer.printStringANumberOfTimes("$", i);
        }
    }
}
