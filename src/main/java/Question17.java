public class Question17 implements Question {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            Printer.printKuKu(i);
            System.out.print("\n");
        }
    }
}
