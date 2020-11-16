import java.util.List;

public class UtilityOfList {
    public static int calculateSumOfList(List list) {
        int sum = 0;
        for (Object o : list) {
            int a = (int) o;
            sum += a;
        }
        return  sum;
    }
    public static int calculateMaxInList(List list){
        
    }
}
