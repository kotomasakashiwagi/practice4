import java.util.ArrayList;
import java.util.List;

public class ListGenerator {
    private static List<Integer> array = new ArrayList<Integer>();
    private static final int N = 9;
    public static List generateListOfNaturalNumber(){
        for (int i =1;i<=N;i++){
            array.add(i);
        }
        return array;
    }
}
