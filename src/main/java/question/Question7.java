package question;

import baseball.ProTeam;
import baseball.Referee;
import baseball.Result;
import baseball.ScoreBord;
import printers.PrinterRelatedBaseball;
import scanners.BaseballScoreScanner;

import java.util.ArrayList;
import java.util.List;

public class Question7 implements Question {
    private static final String GIANTS = "巨人";
    private static final String TIGERS = "阪神";

    @Override
    public void run() {
        ProTeam firstTeam = new ProTeam(GIANTS);
        ProTeam secondTeam = new ProTeam(TIGERS);
        List<Integer> firstScore = new ArrayList<>();
        List<Integer> secondScore = new ArrayList<>();
        ScoreBord scoreBord = new ScoreBord(firstScore, secondScore);
        BaseballScoreScanner.scanScore(firstTeam, secondTeam, scoreBord);

        Result result = Referee.judgeBaseballGame(scoreBord, firstTeam, secondTeam);
        PrinterRelatedBaseball.printResult(scoreBord, firstTeam, secondTeam, result);

    }

}
