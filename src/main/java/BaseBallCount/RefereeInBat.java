package BaseBallCount;

import scanners.CountScanner;

import java.util.EnumMap;

//mapをもらって1打席のカウントを返す
public class RefereeInBat {
    public static String returnResultInBatNOFoul(EnumMap<Counts, Integer> count) {

        while (count.get(Counts.Ball) <= 3 && count.get(Counts.Strike) <= 2) {
            Counts counts = CountScanner.countStrikeOrBall();
            CountsBoard.putScore(count, counts);
        }
        return count.get(Counts.Ball) + Counts.Ball.getName() +
                count.get(Counts.Strike) + Counts.Strike.getName();
    }

    public static String returnResultInBat(EnumMap<Counts, Integer> count) {
        while (count.get(Counts.Ball) <= 3 && count.get(Counts.Strike) <= 2) {
            Counts counts = CountScanner.countStrikeBallFoul();
            CountsBoard.putScore(count, counts);
        }
        return count.get(Counts.Ball) + Counts.Ball.getName() +
                count.get(Counts.Strike) + Counts.Strike.getName();
    }
}
