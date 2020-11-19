package scanners;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoubleScanner {
    private static final int ZERO = 0;

    //
    public static double scanDoubleX() {
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    //0がくるまで入力
    public static List<Double> scanUntilZero() {
        List<Double> scannedList = new ArrayList<>();
        scanUntilX(ZERO, scannedList);
        return scannedList;
    }

    //Xがくるまで入力
    public static void scanUntilX(double X, List<Double> list) {
        double scannedDouble = scanDoubleX();
        while (scannedDouble != X) {
            list.add(scannedDouble);
        }
    }
}
