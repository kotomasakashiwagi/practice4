import java.util.InputMismatchException;
import java.util.List;

public class Question7 implements Question {
    @Override
    public void run() {
        try {
            List list = BaseballScoreBoard.BaseballScore();
            IntPair intPair = AggregateBaseballScore.aggregateBaseballScore(list);
            EnumOfWinOrLose.Winner winner = AggregateBaseballScore.judgeBaseballGame(intPair);
            PrinterRelatedBaseball.printWinTeam(winner);
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
