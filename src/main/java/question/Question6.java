package question;

import utilitylist.ValueCounterInList;
import intpair.IntPair;
import printers.Printer;
import scanners.IntScanner;

import java.util.InputMismatchException;
import java.util.List;

public class Question6 implements Question {
    private static final int WIN = 1;

    @Override
    public void run() {
        try {
            List<Integer> tenNumber0Or1List = IntScanner.scanTenNumbers0Or1();
            IntPair intPair = ValueCounterInList.countValueInList(WIN, tenNumber0Or1List);
            Printer.printWinLose(intPair);
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        }

    }
}

