import java.util.ArrayList;
import java.util.List;

public class BaseballScoreBoard {
    public static final String TEAM1 = "巨人";
    public static final String TEAM2 = "阪神";

    //野球スコアのスキャン
    public static List<Integer> BaseballScore() {
        List<Integer> ScoreBoard = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            PrinterRelatedBaseball.printBaseballScoreBoard1(i, TEAM1);
            int i1 = IntScanner.scanPositiveX();
            if (i1 < 0) {
                throw new IllegalArgumentException("正数字を入れてください");
            }
            PrinterRelatedBaseball.printBaseballScoreBoard2(i, TEAM2);
            int i2 = IntScanner.scanPositiveX();
            if (i2 < 0) {
                throw new IllegalArgumentException("正数字を入れてください");
            }
            ScoreBoard.add(i1);
            ScoreBoard.add(i2);
        }
        return ScoreBoard;
    }
}

