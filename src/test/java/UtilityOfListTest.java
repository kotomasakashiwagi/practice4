import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UtilityOfListTest {
    private List<Integer> createTestListInteger() {
        List<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(10);
        testList.add(100);
        return testList;
    }

    private List<Double> createTestListDouble() {
        List<Double> testList = new ArrayList<>();
        testList.add(1.0);
        testList.add(2.0);
        testList.add(3.0);
        testList.add(10.0);
        testList.add(100.0);
        return testList;
    }

    @Test
    public void calculateSumOfListTest() {
        int i = UtilityOfList.calculateSumOfList(createTestListInteger());
        assertEquals(116, i);
    }

    @Test
    public void calculateSumOfDoubleListTest() {
        double v = UtilityOfList.calculateSumOfDoubleList(createTestListDouble());
        assertEquals(116.0, v);
    }

    @Test
    public void calculateMaxInListTest() {
        int i = UtilityOfList.calculateMaxInList(createTestListInteger());
        assertEquals(100, i);
    }

    @Test
    public void calculateMinInListTest() {
        int i = UtilityOfList.calculateMinInList(createTestListInteger());
        assertEquals(1, i);
    }

    @Test
    public void createListTest() {
        List<String> list = UtilityOfList.createList(2);
        assertEquals(" ", list.get(0));
        assertEquals(" ", list.get(1));
        assertEquals(2, list.size());

    }

    @Test
    public void AddToList() {
        List<Integer> list = createTestListInteger();
        UtilityOfList.AddToList(1000, list);
        assertEquals(1000, list.get(5));
    }
}