package printers;

import baseball.ProTeam;
import baseball.Result;
import baseball.ScoreBord;

public class PrinterRelatedBaseball {

    //表の攻撃
    public static void printBaseballScoreBoard1(int inning, String team) {
        System.out.print(inning + 1 + "回表、" + team + "の得点は？ ");
    }

    //裏の攻撃
    public static void printBaseballScoreBoard2(int inning, String team) {
        System.out.print(inning + 1 + "回裏、" + team + "の得点は？ ");
    }

    //結果の出力
    public static void printResult(ScoreBord scoreBord, ProTeam firstTeam, ProTeam secondTeam, Result result) {
        System.out.println(firstTeam.getName() + ":" + scoreBord.sumFirstScore() +
                " " + secondTeam.getName() + ":" + scoreBord.sumSecondScore());
        printWinTeam(result);
    }

    public static void printWinTeam(Result result) {
        Result.Determinable determinable = result.getDeterminable();
        switch (determinable) {
            case EvenOrOther:
                System.out.println(result.getResult());
                break;
            case Determinable:
                System.out.println(result.getResult() + "の勝ち");
        }

    }

    public static void printStrikeOrBall() {
        System.out.println("ストライク=1 or ボール=2 ?");
    }

    public static void printStrikeOrBallOrFoul() {
        System.out.println("ストライク=1 or ボール=2 orファール=3 ?");
    }
}
