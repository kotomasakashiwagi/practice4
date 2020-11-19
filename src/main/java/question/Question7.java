package question;

import baseball.BaseBallTeam;
import scanners.BaseballScoreBoard;
import baseball.Winner;
import baseball.WinnerJudgement;
import intpair.IntPair;
import printers.PrinterRelatedBaseball;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Question7 implements Question {
    @Override
    public void run() {
        try {
            List<Integer> firstScoreList = new ArrayList<>();
            BaseBallTeam firstTeam = new BaseBallTeam(firstScoreList);
            List<Integer> secondScoreList = new ArrayList<>();
            BaseBallTeam secondTeam = new BaseBallTeam(secondScoreList);
            BaseballScoreBoard.BaseballScore(firstTeam, secondTeam);
            IntPair scoreSumPair = new IntPair(firstTeam.calculateSum(), secondTeam.calculateSum());
            Winner winner = WinnerJudgement.judgeBaseballGame(scoreSumPair);
            PrinterRelatedBaseball.printAggregateScore(scoreSumPair);
            PrinterRelatedBaseball.printWinTeam(winner);
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
