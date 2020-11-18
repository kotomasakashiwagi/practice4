import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AggregateBaseballScoreTest {
    @Test
    public void aggregateBaseballScoreTest() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(0);
        list.add(0);
        list.add(1);
        IntPair intPair = AggregateBaseballScore.aggregateBaseballScore(list);
        assertEquals(3, intPair.getX());
        assertEquals(4, intPair.getY());
    }

    @Test
    public void judgeBaseballGameTest() {
        IntPair testPair1 = new IntPair(5, 6);
        assertEquals(EnumOfWinOrLose.Winner.Team2, AggregateBaseballScore.judgeBaseballGame(testPair1));
        IntPair testPair2 = new IntPair(6, 5);
        assertEquals(EnumOfWinOrLose.Winner.Team1, AggregateBaseballScore.judgeBaseballGame(testPair2));
        IntPair testPair3 = new IntPair(5, 5);
        assertEquals(EnumOfWinOrLose.Winner.Even, AggregateBaseballScore.judgeBaseballGame(testPair3));
    }


}