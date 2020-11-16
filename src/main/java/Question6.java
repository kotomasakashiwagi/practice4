import java.util.InputMismatchException;
import java.util.List;

public class Question6 implements Question {
    @Override
    public void run() {

        try {
            List list = IntScanner.scanTenNumbers0Or1();
            int WIN = 1;
            IntPair intPair = ValueCounterInList.countValueInList(WIN, list);
            Printer.printWinLose(intPair);
        } catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        }

    }
}

