package utilitylist;

import intpair.IntPair;

import java.util.List;

public class ValueCounterInList {
    //リスト中のXの数を数える
    public static IntPair countValueInList(int keyInt, List<Integer> integerList) {
        int count = 0;
        for (Object o : integerList) {
            if (o.equals(keyInt)) {
                count += 1;
            }
        }
        return new IntPair(count, integerList.size() - count);
    }
}
