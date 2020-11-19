package calculator;

import java.util.List;
import java.util.ArrayList;

public class PrimeFactorization {
    //素因数分解
    public static List<Integer> calculatePrimeFactorization(int naturalNumber) {
        List<Integer> primeFactorizationList = new ArrayList<>();
        int primeNumber = 2;
        while (naturalNumber != 1) {
            if (naturalNumber % primeNumber == 0) {
                primeFactorizationList.add(primeNumber);
                naturalNumber = naturalNumber / primeNumber;
            } else {
                primeNumber++;
            }
        }
        return primeFactorizationList;
    }

    public static boolean isPrimeNumber(int naturalNumber) {
        if (naturalNumber % 2 == 0) {
            return false;
        } else {
            int sqrtN = (int) Math.sqrt(naturalNumber);
            for (int i = 2; i < sqrtN; i++) {
                if (naturalNumber % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

