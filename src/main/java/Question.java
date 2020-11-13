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
        CalculateAverage.calculateAverage();
    }
}

class Question6 implements Question {
    @Override
    public void run() {

    }
}

class Question7 implements Question {
    @Override
    public void run() {

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