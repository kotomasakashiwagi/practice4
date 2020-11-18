import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciSequenceTest {
    @Test
    public void fibonacciRecurrenceFormula() {
        List<Integer> list = new ArrayList<>();
        FibonacciSequence.fibonacciRecurrenceFormula(0, 1, 10, list);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
        assertEquals(5, list.get(3));
        assertEquals(5, list.size());
    }

}