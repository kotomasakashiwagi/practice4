package printers;

import baseball.EnumOfBaseballTeam;
import baseball.Winner;
import intpair.IntPair;

public class PrinterRelatedBaseball {

    //表の攻撃
    public static void printBaseballScoreBoard1(int inning, String team) {
        System.out.print(inning + 1 + "回表、" + team + "の得点は？ ");
    }

    //裏の攻撃
    public static void printBaseballScoreBoard2(int inning, String team) {
        System.out.print(inning + 1 + "回裏、" + team + "の得点は？ ");
    }

    //得点の合計
    public static void printAggregateScore(IntPair intPair) {
        System.out.println(EnumOfBaseballTeam.Giants.getTeamName() + ":" + intPair.getX() +
                " " + EnumOfBaseballTeam.Tigers.getTeamName() + ":" + intPair.getY());
    }

    //勝ったチームの出力
    public static void printWinTeam(Winner en) {
        if (en == Winner.Team1) {
            System.out.println(EnumOfBaseballTeam.Giants.getTeamName() + "の勝ち");
        } else if (en == Winner.Team2) {
            System.out.println(EnumOfBaseballTeam.Tigers.getTeamName() + "の勝ち");
        } else {
            System.out.println("引き分け");
        }
    }

    public static void printStrikeOrBall() {
        System.out.println("ストライク=1 or ボール=2 ?");
    }

    public static void printStrikeOrBallOrFoul() {
        System.out.println("ストライク=1 or ボール=2 orファール=3 ?");
    }
}
