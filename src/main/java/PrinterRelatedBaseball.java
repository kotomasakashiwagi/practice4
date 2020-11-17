public class PrinterRelatedBaseball {
    private static final String Giants = "巨人";
    private static final String Tigers = "阪神";

    //表の攻撃
    public static void printBaseballScoreBoard1(int i, String s) {
        System.out.print(i + 1 + "回表、" + s + "の得点は？ ");
    }

    //裏の攻撃
    public static void printBaseballScoreBoard2(int i, String s) {
        System.out.print(i + 1 + "回裏、" + s + "の得点は？ ");
    }

    //得点の合計
    public static void printAggregateScore(IntPair intPair) {
        System.out.println(Giants + ":" + intPair.getX() + " " + Tigers + ":" + intPair.getY());
    }

    //勝ったチームの出力
    public static void printWinTeam(EnumOfWinOrLose.Winner en) {
        if (en == EnumOfWinOrLose.Winner.Team1) {
            System.out.println(Giants + "の勝ち");
        } else if (en == EnumOfWinOrLose.Winner.Team2) {
            System.out.println(Tigers + "の勝ち");
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
