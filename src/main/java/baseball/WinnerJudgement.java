package baseball;

import intpair.IntPair;

public class WinnerJudgement {
    //勝ち負け引き分けを決める
    public static Winner judgeBaseballGame(IntPair intPairScore) {
        if (intPairScore.getX() > intPairScore.getY()) {
            return Winner.Team1;
        } else if (intPairScore.getY() > intPairScore.getX()) {
            return Winner.Team2;
        }
        return Winner.Even;
    }
}
