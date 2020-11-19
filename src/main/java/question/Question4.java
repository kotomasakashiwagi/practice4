package question;

import printers.Printer;

public class Question4 implements Question {
    @Override
    public void run() {
        Printer.printFactorial();
    }
}