package scanners;

import scanners.*;
import printers.*;
public class BaseballCount {
    //カウントを入力ファールなし
    public static String countStrikeOrBall() {
        int strike = 0;
        int ball = 0;
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

    //カウントを入力ファールあり
    public static String countStrikeBallFoul() {
        int strike = 0;
        int ball = 0;
        //int foul = 0;
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
