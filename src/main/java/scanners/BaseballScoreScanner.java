package scanners;

import baseball.ProTeam;
import baseball.ScoreBord;
import printers.PrinterRelatedBaseball;

import java.util.InputMismatchException;

public class BaseballScoreScanner {
    //野球スコアのスキャン
    public static void scanScore(ProTeam firstTeam, ProTeam secondTeam, ScoreBord scoreBord) {
        int count = 0;
        while (count < 9) {
            int firstScore = 0;
            int secondScore = 0;
            try {
                PrinterRelatedBaseball.printBaseballScoreBoard1(count, firstTeam.getName());
                firstScore = IntScanner.scanPositiveX();
                PrinterRelatedBaseball.printBaseballScoreBoard2(count, secondTeam.getName());
                secondScore = IntScanner.scanPositiveX();
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.err.println("正の数字を入力してください。");
                continue;
            }
            scoreBord.addFirstScore(firstScore);
            scoreBord.addSecondScore(secondScore);
            count++;
        }
    }
}

