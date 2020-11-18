import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListGeneratorTest {
@Test
    public void generateListOfNaturalNumberTest(){
    List<Integer> list = ListGenerator.generateListOfNaturalNumber();
    assertEquals(1,list.get(0));
    assertEquals(3,list.get(2));
    assertEquals(9,list.get(8));
    assertEquals(9,list.size());
}
}