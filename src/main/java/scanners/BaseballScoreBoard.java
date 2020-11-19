package scanners;

import baseball.BaseBallTeam;
import baseball.EnumOfBaseballTeam;
import printers.PrinterRelatedBaseball;
import scanners.IntScanner;

public class BaseballScoreBoard {
    //野球スコアのスキャン
    public static void BaseballScore(BaseBallTeam firstTeam, BaseBallTeam secondTeam) {
        for (int i = 0; i < 9; i++) {
            PrinterRelatedBaseball.printBaseballScoreBoard1(i, EnumOfBaseballTeam.Giants.getTeamName());
            int i1 = IntScanner.scanPositiveX();
            if (i1 < 0) {
                throw new IllegalArgumentException("正数字を入れてください");
            }
            PrinterRelatedBaseball.printBaseballScoreBoard2(i, EnumOfBaseballTeam.Tigers.getTeamName());
            int i2 = IntScanner.scanPositiveX();
            if (i2 < 0) {
                throw new IllegalArgumentException("正数字を入れてください");
            }
            firstTeam.addScore(i1);
            secondTeam.addScore(i2);
        }
    }
}

