package utilitylist;

import java.util.ArrayList;
import java.util.List;

public class ListGenerator {
    private static final int N = 9;

    public static List<Integer> generateListFromZero() {
        List<Integer> fromZeroList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            fromZeroList.add(i);
        }
        return fromZeroList;
    }
}
