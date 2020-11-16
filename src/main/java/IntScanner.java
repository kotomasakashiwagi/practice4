import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntScanner {
    public static List scanTenNumbers(String s) {
        Printer.printString(s);
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int n = scan.nextInt();
            list.add(n);
        }
        return list;
    }

    public static List scanTenNumbers0Or1(String s) {
        Printer.printString(s);
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int n = scan.nextInt();
            if (!(n == 1 || n == 0)) {
                System.err.println("0もしくは1を入力してください。");
                System.exit(0);
            }
            list.add(n);
        }
        return list;
    }
//一回の野球の得点をスキャン
    public static int scanIntX() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
//正数字をスキャン
    public static int scanPositiveX() {

        int x = scanIntX();
        if (x < 0) {
            throw new IllegalArgumentException("正数字を入れてください");
        }
        return x;

    }
}
