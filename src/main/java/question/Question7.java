package question;

import baseball.BaseballTeam;
import scanners.BaseballScoreBoard;
import baseball.Winner;
import baseball.Referee;
import intpair.IntPair;
import printers.PrinterRelatedBaseball;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Question7 implements Question {
    @Override
    public void run() {
        try {
            List<Integer> firstScoreList = new ArrayList<>();//表のスコア
            BaseballTeam firstTeam = new BaseballTeam(firstScoreList);
            List<Integer> secondScoreList = new ArrayList<>();//裏のスコア
            BaseballTeam secondTeam = new BaseballTeam(secondScoreList);

            BaseballScoreBoard.scanScore(firstTeam, secondTeam);

            IntPair scoreSumPair = new IntPair(firstTeam.sumScore(), secondTeam.sumScore());
            Winner winner = Referee.judgeBaseballGame(scoreSumPair);//試合結果にする。

            PrinterRelatedBaseball.printResult(scoreSumPair);//両方の点数
            PrinterRelatedBaseball.printWinTeam(winner);// 勝った方
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
