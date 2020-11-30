package baseball;

import java.util.List;

public class Referee {//試合結果を求めるクラスにする

    //勝ち負け引き分けを決める
    //結果のクラスを返す
    private static final String EVEN = "引き分け";
    private static final String OTHER = "不適切な結果です";

    public static Result judgeBaseballGame(ScoreBord scoreBord, ProTeam firstTeam, ProTeam secondTeam) {
        Integer firstTeamScore = scoreBord.sumFirstScore();
        Integer secondTeamScore = scoreBord.sumSecondScore();
        int result = firstTeamScore.compareTo(secondTeamScore);
        switch (result) {
            case 1:
                return new Result(firstTeam.getName(), Result.Determinable.Determinable);
            case -1:
                return new Result(secondTeam.getName(), Result.Determinable.Determinable);
            case 0:
                return new Result(EVEN, Result.Determinable.EvenOrOther);
            default:
                return new Result(OTHER, Result.Determinable.EvenOrOther);
        }

    }

    public int sumScore(List<Integer> scoreList) {
        return scoreList.stream().mapToInt(integer -> integer).sum();
    }
}
