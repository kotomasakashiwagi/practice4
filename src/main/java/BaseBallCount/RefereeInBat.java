package BaseBallCount;

import scanners.CountScanner;

import java.util.EnumMap;

//mapをもらって1打席のカウントを返す
public class RefereeInBat {
    private static final int THREE = 3;
    private static final int TWO = 2;

    public static String returnResultInBatIgnoreFoul(EnumMap<Counts, Integer> count) {

        while (count.get(Counts.Ball) <= THREE && count.get(Counts.Strike) <= TWO) {
            Counts counts = CountScanner.countStrikeOrBall();
            CountsBoard.putScore(count, counts);
        }
        return count.get(Counts.Ball) + Counts.Ball.getName() +
                count.get(Counts.Strike) + Counts.Strike.getName();
    }

    public static String returnResultInBat(EnumMap<Counts, Integer> count) {
        while (count.get(Counts.Ball) <= THREE && count.get(Counts.Strike) <= TWO) {
            Counts counts = CountScanner.countStrikeBallFoul();
            CountsBoard.putScore(count, counts);
        }
        return count.get(Counts.Ball) + Counts.Ball.getName() +
                count.get(Counts.Strike) + Counts.Strike.getName();
    }
}
