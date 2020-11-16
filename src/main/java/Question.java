import java.util.InputMismatchException;
import java.util.List;

public interface Question {
    void run();
}

class Question1 implements Question {

    @Override
    public void run() {
        Printer.printWords();
    }
}

class Question2 implements Question {
    @Override
    public void run() {
        Printer.printKuKu();
    }
}

class Question3 implements Question {
    @Override
    public void run() {
        Printer.printExp();
    }
}

class Question4 implements Question {
    @Override
    public void run() {
        Printer.printFactorial();
    }
}

class Question5 implements Question {
    @Override
    public void run() {
        try {
            List list = IntScanner.scanTenNumbers("整数を１０個入力してください。");
            int ave = UtilityOfList.calculateSumOfList(list) / list.size();
            Printer.printInt(ave);
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        }
    }
}

class Question6 implements Question {
    @Override
    public void run() {

        try {
            List list = IntScanner.scanTenNumbers0Or1("0か1の整数を１０個入力してください。");
            int WIN = 1;
            IntPair intPair = ValueCounterInList.countValueInList(WIN, list);
            Printer.printWinLose(intPair);
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        }

    }
}

class Question7 implements Question {
    @Override
    public void run() {
        try {
            List list = BaseballScoreBoard.BaseballScore();
            IntPair intPair = AggregateBaseballScore.aggregateBaseballScore(list);
            EnumOfWinOrLose.Winner winner = AggregateBaseballScore.judgeBaseballGame(intPair);
            PrinterRelatedBaseball.printWinTeam(winner);
        }catch (InputMismatchException e){
            System.err.println("数字を入力してください。");
        }
    }
}

class Question8 implements Question {
    @Override
    public void run() {

    }
}

class Question9 implements Question {
    @Override
    public void run() {

    }
}

class Question10 implements Question {
    @Override
    public void run() {

    }
}

class Question11 implements Question {
    @Override
    public void run() {

    }
}

class Question12 implements Question {
    @Override
    public void run() {

    }
}

class Question13 implements Question {
    @Override
    public void run() {

    }
}

class Question14 implements Question {
    @Override
    public void run() {

    }
}

class Question15 implements Question {
    @Override
    public void run() {

    }
}

class Question16 implements Question {
    @Override
    public void run() {

    }
}

class Question17 implements Question {
    @Override
    public void run() {

    }
}

class Question18 implements Question {
    @Override
    public void run() {

    }
}

class Question19 implements Question {
    @Override
    public void run() {

    }
}

class Question20 implements Question {
    @Override
    public void run() {

    }
}

class Question21 implements Question {
    @Override
    public void run() {

    }
}

class Question22 implements Question {
    @Override
    public void run() {

    }
}

class OutOfQuestion implements Question {
    @Override
    public void run() {
        System.err.println("正しい問題番号を入力してください。");
    }
}