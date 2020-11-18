import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorizationTest {
    @Test
    public void primeFactorizationTest() {
        List<Integer> list = PrimeFactorization.primeFactorization(4);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(4, list.get(2));
        assertEquals(3, list.size());
    }

    @Test
    public void isPrimeNumber() {
        assertTrue(PrimeFactorization.isPrimeNumber(7));
        assertFalse(PrimeFactorization.isPrimeNumber(8));
        assertTrue(PrimeFactorization.isPrimeNumber(11));
    }
}