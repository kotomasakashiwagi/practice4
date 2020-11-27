package scanners;

import baseball.BaseballTeam;
import baseball.ProTeam;
import printers.PrinterRelatedBaseball;

public class BaseballScoreBoard {
    //野球スコアのスキャン
    public static void scanScore(BaseballTeam firstTeam, BaseballTeam secondTeam) {
        for (int i = 0; i < 9; i++) {
            PrinterRelatedBaseball.printBaseballScoreBoard1(i, ProTeam.Giants.getTeamName());
            int i1 = IntScanner.scanPositiveX();
            if (i1 < 0) {
                System.out.println("正数字を入れてください");
                i1 = IntScanner.scanPositiveX();
            }
            PrinterRelatedBaseball.printBaseballScoreBoard2(i, ProTeam.Tigers.getTeamName());
            int i2 = IntScanner.scanPositiveX();
            if (i2 < 0) {
                throw new IllegalArgumentException("正数字を入れてください");
            }
            firstTeam.addScore(i1);
            secondTeam.addScore(i2);
        }
    }
}

