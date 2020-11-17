import java.util.List;
import java.util.ArrayList;

public class PrimeFactorization {
    private static List<Integer> list = new ArrayList<>();

    public static List primeFactorization(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static boolean isPrimeNumber(int n) {
        List list = primeFactorization(n);
        return list.size() == 2;
    }
}

