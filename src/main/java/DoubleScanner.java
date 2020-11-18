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
        List<Double> list = new ArrayList<>();
        scanUntilX(ZERO, list);
        return list;
    }

    //Xがくるまで入力
    public static void scanUntilX(double d, List<Double> list) {
        double v = scanDoubleX();
        list.add(v);
        if (v == 0) {
            System.out.println("入力は終了です。");
        } else scanUntilX(d, list);
    }
}
