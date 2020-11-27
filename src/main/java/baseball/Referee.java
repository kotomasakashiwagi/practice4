package baseball;

import intpair.IntPair;

public class Referee {//試合結果を求めるクラスにする
    //勝ち負け引き分けを決める
    public static Winner judgeBaseballGame(IntPair intPairScore) {//結果のクラスを返す
        if (intPairScore.getX() > intPairScore.getY()) {
            return Winner.Team1;
        } else if (intPairScore.getY() > intPairScore.getX()) {
            return Winner.Team2;
        }
        return Winner.Even;
    }
}
