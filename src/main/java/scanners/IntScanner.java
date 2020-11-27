package scanners;

import printers.Printer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class IntScanner {
    private static final int TEN = 10;

    public static List<Integer> scanTenNumbers() {
        Printer.printString("整数を１０個入力してください。");
        Scanner scan = new Scanner(System.in);
        List<Integer> tenNumberList = new ArrayList<>();
        for (int i = 0; i < TEN; i++) {
            int n = scan.nextInt();
            tenNumberList.add(n);
        }
        return tenNumberList;
    }

    public static List<Integer> scanTenNumbers0Or1() {
        Printer.printString("0か1の整数を１０個入力してください。");
        Scanner scan = new Scanner(System.in);
        List<Integer> tenNumberList0Or1 = new ArrayList<>();
        for (int i = 0; i < TEN; i++) {
            int scannedInt = scan.nextInt();
            if (!(scannedInt == 1 || scannedInt == 0)) {
                System.err.println("0もしくは1を入力してください。");
                System.exit(0);
            }
            tenNumberList0Or1.add(scannedInt);
        }
        return tenNumberList0Or1;
    }

    //一回の野球の得点をスキャン
    public static int scanIntX() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    //正数字をスキャン
    public static int scanPositiveX() {
        int scannedInt = scanIntX();
        if (scannedInt < 0) {
            throw new IllegalArgumentException("正数字を入れてください");
        }
        return scannedInt;

    }


    public static List<Integer> scanTenPositiveX() {
        System.out.println("正数字を１０個入力してください。");
        Scanner scan = new Scanner(System.in);
        List<Integer> positiveTenIntegerList = new ArrayList<>();
        for (int i = 0; i < TEN; i++) {
            int x = scan.nextInt();
            if (x < 0) {
                throw new IllegalArgumentException("正数字を入れてください");
            }
            positiveTenIntegerList.add(x);
        }
        return positiveTenIntegerList;
    }

    public static int scanOneOrTwo() {
        try {
            return scanIntX();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("1か2を入れてください");
        }

    }

    public static int scanOneOrTwoOrThree() {
        try {
            return scanIntX();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("1か2か3を入れてください");
        }
    }

    public static int scanXMoreThanTwo() {
        int scannedInt = scanIntX();
        if (scannedInt < 2) {
            throw new IllegalArgumentException("2以上の整数を入れてください");
        }
        return scannedInt;
    }

}
