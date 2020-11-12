import java.text.DecimalFormat;

public class Printer {

    private static final String SPAM = "SPAM";
    private static DecimalFormat format1 = new DecimalFormat("0.#");

    public static void printWords(String s, int j) {
        for (int i = 0; i < j; i++) {
            System.out.println(s);
        }
    }

    public static void printWords() {
        printWords(SPAM, 10);
    }

    public static void printKuKu(int j) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(j * i);
        }
    }

    public static void printKuKu() {
        printKuKu(3);
    }

    public static void printExp(int n, int j) {
        for (int i = 1; i <= j; i++) {
            System.out.println(format1.format(Math.pow(n, i)));
        }
    }

    public static void printExp() {
        printFactorial(7);
    }
    public static void printFactorial(int j) {
        int factorial = 0;
        for (int i = 0; i < j; i++) {
            factorial += factorial*(j-i);
        }
        System.out.println(factorial);
    }

    public static void printFactorial() {
        printFactorial( 7);
    }

}
