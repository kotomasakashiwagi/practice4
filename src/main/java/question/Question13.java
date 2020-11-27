package question;

import BaseBallCount.CountsBoard;
import BaseBallCount.RefereeInBat;
import printers.Printer;

import java.util.InputMismatchException;

public class Question13 implements Question {
    @Override
    public void run() {
        try {
            CountsBoard countsBoard = new CountsBoard();
            String result = RefereeInBat.returnResultInBatNOFoul(countsBoard.countTable);
            Printer.printString(result);
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}

