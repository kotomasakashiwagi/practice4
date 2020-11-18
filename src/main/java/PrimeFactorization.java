import java.util.List;
import java.util.ArrayList;

public class PrimeFactorization {
    //素因数分解
    public static List<Integer> primeFactorization(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static boolean isPrimeNumber(int n) {
        List<Integer> list = primeFactorization(n);
        return list.size() == 2;
    }
}

