public class BaseballCount {
    private static int strike = 0;
    private static int ball = 0;
    private static int foul = 0;

    public static String countStrikeOrBall() {
        while (strike < 3 && ball < 4) {
            PrinterRelatedBaseball.printStrikeOrBall();
            int i = IntScanner.scanOneOrTwo();
            if (i == 1) {
                strike += 1;
            } else {
                ball += 1;
            }
        }
        return ball + "ボール" + strike + "ストライク";
    }

    public static String countStrikeBallFoul() {
        while (strike < 3 && ball < 4) {
            PrinterRelatedBaseball.printStrikeOrBallOrFoul();
            int i = IntScanner.scanOneOrTwoOrThree();
            if (i == 1) {
                strike += 1;
            } else if (i == 2) {
                ball += 1;
            } else if (i == 3 && strike < 2) {
                strike += 1;
            }
        }
        return ball + "ボール" + strike + "ストライク";
    }
}
