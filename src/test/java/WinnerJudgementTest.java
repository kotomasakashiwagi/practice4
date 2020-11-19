import intpair.IntPair;
import org.junit.Test;
import baseball.*;

import static org.junit.jupiter.api.Assertions.*;

public class WinnerJudgementTest {
    @Test
    public void judgeBaseballGameTest() {
        IntPair testPair1 = new IntPair(5, 6);
        assertEquals(Winner.Team2, WinnerJudgement.judgeBaseballGame(testPair1));
        IntPair testPair2 = new IntPair(6, 5);
        assertEquals(Winner.Team1, WinnerJudgement.judgeBaseballGame(testPair2));
        IntPair testPair3 = new IntPair(5, 5);
        assertEquals(Winner.Even, WinnerJudgement.judgeBaseballGame(testPair3));
    }


}