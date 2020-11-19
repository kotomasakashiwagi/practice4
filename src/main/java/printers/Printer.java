package printers;

import calculator.Calculator;
import intpair.IntPair;
import utilitylist.ListGenerator;

import java.text.DecimalFormat;
import java.util.List;

public class Printer {

    private static final String SPAM = "SPAM";
    private static final DecimalFormat format1 = new DecimalFormat("0.#");
    private static final String PRIME = "素数";
    private static final String NOTPRIME = "素数でない";

    //10回同じ単語を出力
    public static void printWords(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    public static void printWords() {
        printWords(SPAM, 10);
    }

    //九九を一段出力
    public static void printKuKu(int naturalNumber) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d", naturalNumber * i);
        }
    }

    public static void printKuKu() {
        printKuKu(3);
    }

    //累乗をまとめて出力
    public static void printExp(int number, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(Calculator.calculatePower(number, i));
        }
    }

    public static void printExp() {
        printExp(2, 8);
    }

    // 階乗を出力
    public static void printFactorial(int naturalNumber) {
        Calculator.calculateFactorial(naturalNumber);
    }

    public static void printFactorial() {
        printFactorial(7);
    }

    public static void printInt(int number) {
        System.out.println(number);
    }

    public static void printWinLose(IntPair intPair0Or1) {
        System.out.println("勝ち数" + intPair0Or1.getX() + " " + "負け数" + intPair0Or1.getY());
    }

    public static void printString(String s) {
        System.out.println(s);
    }

    public static void printMaxAndMin(int max, int min) {
        System.out.println("max " + max + " , " + "min " + min);
    }

    public static void printAsterisk(int naturalNumber) {
        for (int i = 0; i < naturalNumber; i++) {
            System.out.println("*");
        }
    }

    public static void printListRepeatedly(int naturalNumber) {
        List<Integer> list = ListGenerator.generateListFromZero();
        for (int i = 0; i < naturalNumber; i++) {
            int a = i % 10;
            System.out.print(list.get(a));
        }
    }


    public static void printIsPrimeNumber(boolean isPrime) {
        if (isPrime) {
            System.out.println(PRIME);
        } else {
            System.out.println(NOTPRIME);
        }
    }

    public static void printListRow(List<Integer> rowIntList) {
        for (Integer integer : rowIntList) {
            System.out.println(integer);
        }
    }

    public static void printListLine(List<String> lineStringList) {
        for (String s : lineStringList) {
            System.out.print(s);
        }
    }


    public static void printDouble(double d) {
        System.out.println(d);
    }

    public static void printStringANumberOfTimes(String keyWord, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(keyWord + " ");
        }
        System.out.print("\n");

    }
}
