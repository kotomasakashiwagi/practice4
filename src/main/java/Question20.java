public class Question20 implements Question {
    @Override
    public void run() {
        System.out.println("正の整数を入力してください。");
        int n = IntScanner.scanPositiveX();
        for (int i = 1; i <= n; i++) {
            Printer.printStringANumberOfTimes("$", i);
        }
    }
}
