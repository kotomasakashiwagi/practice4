import java.util.ArrayList;
import java.util.List;

public class UtilityOfList {
    public static int calculateSumOfList(List list) {
        int sum = 0;
        for (Object o : list) {
            int a = (int) o;
            sum += a;
        }
        return sum;
    }

    public static double calculateSumOfDoubleList(List list) {
        double sum = 0;
        for (Object o : list) {
            double a = (double) o;
            sum += a;
        }
        return sum;
    }

    public static int calculateMaxInList(List list) {
        int max = (int) list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < (int) list.get(i)) {
                max = (int) list.get(i);
            }
        }
        return max;
    }

    public static int calculateMinInList(List list) {
        int min = (int) list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min > (int) list.get(i)) {
                min = (int) list.get(i);
            }
        }
        return min;
    }


    public static int calculateSumOfListUnderHundred() {
        int sum = 0;
        while (sum <= 100) {
            int i = IntScanner.scanIntX();
            sum += i;
        }
        return sum;
    }

    public static List createList(int n) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            list.add(" ");
        }
        return list;
    }

}
