import java.util.*;

public class SymbolPrinter {
    private static final String X = "X";
    public static void printSymbolToCrossMark(int n) {
        for (int i = 0; i < n; i++) {
            List list = UtilityOfList.createList(n);
            list.set(i, X);
            list.set(n - i-1, X);
            Printer.printListLine(list);
            System.out.print("\n");
        }
    }
}
