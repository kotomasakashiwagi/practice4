import org.junit.Test;
import utilitylist.ListGenerator;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListGeneratorTest {
@Test
    public void generateListOfNaturalNumberTest(){
    List<Integer> list = ListGenerator.generateListFromZero();
    assertEquals(0,list.get(0));
    assertEquals(1,list.get(1));
    assertEquals(2,list.get(2));
    assertEquals(10,list.size());
}
}