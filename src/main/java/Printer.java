import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Printer {

    private static final String SPAM = "SPAM";
    private static DecimalFormat format1 = new DecimalFormat("0.#");

    //10回同じ単語を出力
    public static void printWords(String s, int j) {
        for (int i = 0; i < j; i++) {
            System.out.println(s);
        }
    }

    public static void printWords() {
        printWords(SPAM, 10);
    }

    //九九を一段出力
    public static void printKuKu(int j) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(j * i);
        }
    }

    public static void printKuKu() {
        printKuKu(3);
    }

    //累乗をまとめて出力
    public static void printExp(int n, int j) {
        for (int i = 1; i <= j; i++) {
            System.out.println(format1.format(Math.pow(n, i)));
        }
    }

    public static void printExp() {
        printExp(2, 8);
    }

    // 階乗を出力
    public static void printFactorial(int j) {
        int factorial = j;
        for (int i = 1; i < j; i++) {
            factorial = factorial * (j - i);
        }
        System.out.println(factorial);
    }

    public static void printFactorial() {
        printFactorial(7);
    }

    public static void printInt(int x) {
        System.out.println(x);
    }

    public static void printWinLose(IntPair intPair) {
        System.out.println("勝ち数" + intPair.getX() + " " + "負け数" + intPair.getY());
    }

    public static void printString(String s) {
        System.out.println(s);
    }

    public static void printMaxAndMin(int max, int min) {
        System.out.println("max " + max + " , " + "min " + min);
    }

    public static void printAsterisk(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\"");
        }
    }

    public static void printListRepeatedly(int n) {
        List list = ListGenerator.generateListOfNaturalNumber();
        list.add(0);
        for (int i = 0; i < n; i++) {
            int a = i % 10;
            System.out.print(list.get(a));
        }
    }

    private static final String PRIME = "素数";
    private static final String NOTPRIME = "素数でない";

    public static void printIsPrimeNumber(boolean b) {
        if (b) {
            System.out.println(PRIME);
        } else {
            System.out.println(NOTPRIME);
        }
    }

    public static void printList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }


}
