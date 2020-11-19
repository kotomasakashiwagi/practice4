package printers;

import printers.Printer;
import utilitylist.UtilityOfList;

import java.util.*;

public class SymbolPrinter {
    private static final String X = "X";

    public static void printSymbolToCrossMark(int naturalNumber) {
        for (int i = 0; i < naturalNumber; i++) {
            List<String> initialList = UtilityOfList.createList(naturalNumber);
            initialList.set(i, X);
            initialList.set(naturalNumber - i - 1, X);
            Printer.printListLine(initialList);
            System.out.print("\n");
        }
    }
}
