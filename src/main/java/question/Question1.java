package question;

import printers.Printer;

public class Question1 implements Question {

    @Override
    public void run() {
        Printer.printWords();
    }
}