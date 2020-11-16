import java.util.List;

public class ValueCounterInList {
    public static IntPair countValueInList(int i, List list){
        int count = 0;
        for (Object o : list) {
            if (o.equals(i)) {
                count += 1;
            }
        }
        return new IntPair(count,list.size()-count);
    }
}
