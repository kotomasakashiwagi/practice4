public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("引数の数はひとつで問題番号である必要があります。");
        } else if (args[0].equals("4-1")) {
            Printer.printWords();
        } else if (args[0].equals("4-2")) {
            Printer.printKuKu();
        } else if (args[0].equals("4-3")) {
            Printer.printExp();
        } else if (args[0].equals("4-4")) {
            Printer.printFactorial();
        } else if (args[0].equals("4-5")) {
            Printer.printExp();
        }

    }
}
