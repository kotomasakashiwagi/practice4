import utilitylist.ValueCounterInList;
import intpair.IntPair;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ValueCounterInListTest {
    private List<Integer> createTestListInteger() {
        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(1);
        testList.add(0);
        testList.add(0);
        testList.add(1);
        return testList;
    }

    @Test
    public void countValueInList() {
        List<Integer> testListInteger = createTestListInteger();
        IntPair intPair = ValueCounterInList.countValueInList(0, testListInteger);
        IntPair that = new IntPair(2, 3);
        assertEquals(that.getX(), intPair.getX());
        assertEquals(that.getY(), intPair.getY());
    }

}