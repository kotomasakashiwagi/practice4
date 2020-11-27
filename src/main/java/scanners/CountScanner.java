package scanners;

import BaseBallCount.Counts;
import printers.PrinterRelatedBaseball;

import java.util.InputMismatchException;

public class CountScanner {
    //カウントを入力ファールなし
    public static Counts countStrikeOrBall() {
        PrinterRelatedBaseball.printStrikeOrBall();//ストライク=1 or ボール=2 ？
        int i = IntScanner.scanOneOrTwo();
        switch (i) {
            case 1:
                return Counts.Strike;
            case 2:
                return Counts.Ball;
            default:
                throw new InputMismatchException("1か2を入力してください。");
        }
    }

    //カウントを入力ファールあり
    public static Counts countStrikeBallFoul() {
        PrinterRelatedBaseball.printStrikeOrBallOrFoul();//ストライク=1 or ボール=2 orファール=3 ?
        int i = IntScanner.scanOneOrTwoOrThree();
        switch (i) {
            case 1:
                return Counts.Strike;
            //  break;
            case 2:
                return Counts.Ball;
            //   break;
            case 3:
                return Counts.Foul;
            default:
                throw new InputMismatchException("1か2か3を入力してください。");
        }
    }
}
