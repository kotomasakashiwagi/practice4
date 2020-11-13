import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntScanner {
    public static List scanTenNumbers(){
        System.out.println("整数を１０個入力してください。");
        Scanner scan = new Scanner(System.in);
        List list = new ArrayList();
        for(int i=0;i<10;i++){
            list.add(scan.nextInt());
        }
        return list;
    }
}
