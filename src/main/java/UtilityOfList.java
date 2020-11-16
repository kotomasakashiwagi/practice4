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
}
