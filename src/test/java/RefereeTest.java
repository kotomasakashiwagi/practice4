import intpair.IntPair;
import org.junit.Test;
import baseball.*;

import static org.junit.jupiter.api.Assertions.*;

public class RefereeTest {
    @Test
    public void judgeBaseballGameTest() {
        IntPair testPair1 = new IntPair(5, 6);
        assertEquals(Winner.Team2, Referee.judgeBaseballGame(testPair1));
        IntPair testPair2 = new IntPair(6, 5);
        assertEquals(Winner.Team1, Referee.judgeBaseballGame(testPair2));
        IntPair testPair3 = new IntPair(5, 5);
        assertEquals(Winner.Even, Referee.judgeBaseballGame(testPair3));
    }


}