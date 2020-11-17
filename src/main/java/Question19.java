import java.util.InputMismatchException;
import java.util.List;

public class Question19 implements Question{
    @Override
    public void run(){
        System.out.println("最初に0は入れずに0を入れるまで数字を入力してください。");
        System.out.println("例：\n30 \n40 \n20 \n0");
        try {
            List list = DoubleScanner.scanUntilZero();
            if(list.size()==1){
                System.err.println("最初に0は入れないでください。");
                System.exit(0);
            }
            double d = UtilityOfList.calculateSumOfDoubleList(list)/(list.size()-1);
            System.out.println("平均は");
            Printer.printDouble(d);
        }catch (InputMismatchException e) {
            System.err.println("数字を入力してください。");
        }
    }
}
