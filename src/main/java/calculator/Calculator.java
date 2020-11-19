package calculator;

public class Calculator {
    public static int calculatePower(int number, int exponent) {
        return (int) Math.pow(number, exponent);
    }

    public static int calculateFactorial(int naturalNumber) {
        int fact = 1;
        for (int i = 1; i <= naturalNumber; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
