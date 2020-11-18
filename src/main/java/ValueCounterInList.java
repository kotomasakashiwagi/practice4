import java.util.List;

public class ValueCounterInList {
    //リスト中のXの数を数える
    public static IntPair countValueInList(int i, List<Integer> list) {
        int count = 0;
        for (Object o : list) {
            if (o.equals(i)) {
                count += 1;
            }
        }
        return new IntPair(count, list.size() - count);
    }
}
