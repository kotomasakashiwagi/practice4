import java.util.List;

//スコアをそれぞれ合計したIntpairを返す
public class AggregateBaseballScore {
    public static IntPair aggregateBaseballScore(List<Integer> list) {
        int team1Score = 0;
        int team2Score = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                team1Score += (int) list.get(i);
            } else {
                team2Score += (int) list.get(i);
            }


        }
        IntPair intPair = new IntPair(team1Score, team2Score);
        PrinterRelatedBaseball.printAggregateScore(intPair);
        return intPair;
    }

    //勝ち負け引き分けを決める
    public static EnumOfWinOrLose.Winner judgeBaseballGame(IntPair intPair) {
        if (intPair.getX() > intPair.getY()) {
            return EnumOfWinOrLose.Winner.Team1;
        } else if (intPair.getY() > intPair.getX()) {
            return EnumOfWinOrLose.Winner.Team2;
        }
        return EnumOfWinOrLose.Winner.Even;
    }
}
