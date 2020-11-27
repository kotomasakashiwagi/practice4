package printers;

import baseball.ProTeam;
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

    //結果の出力
    public static void printResult(IntPair intPair) {
        System.out.println(ProTeam.Giants.getTeamName() + ":" + intPair.getX() +
                " " + ProTeam.Tigers.getTeamName() + ":" + intPair.getY());
    }

    //勝ったチームの出力　printResultに入れる。
    public static void printWinTeam(Winner en) {
        if (en == Winner.Team1) {
            System.out.println(ProTeam.Giants.getTeamName() + "の勝ち");
        } else if (en == Winner.Team2) {
            System.out.println(ProTeam.Tigers.getTeamName() + "の勝ち");
        } else {
            System.out.println("引き分け");
        }//それ以外の場合の例外を出す
    }

    public static void printStrikeOrBall() {
        System.out.println("ストライク=1 or ボール=2 ?");
    }

    public static void printStrikeOrBallOrFoul() {
        System.out.println("ストライク=1 or ボール=2 orファール=3 ?");
    }
}
