package utilitylist;

import scanners.IntScanner;

import java.util.ArrayList;
import java.util.List;

public class UtilityOfList {
    public static int calculateSumOfList(List<Integer> intList) {
        int sum = 0;
        for (Object o : intList) {
            sum += (int) o;
        }
        return sum;
    }

    public static int calculateAverageOfList(List<Integer> intList) {
        return calculateSumOfList(intList) / intList.size();
    }

    public static double calculateAverageOfDoubleList(List<Double> doublesList) {
        return calculateSumOfDoubleList(doublesList) / doublesList.size();
    }

    public static double calculateSumOfDoubleList(List<Double> doubleList) {
        double sum = 0;
        for (Object o : doubleList) {
            sum += (double) o;
        }
        return sum;
    }

    public static int calculateMaxInList(List<Integer> integerList) {
        int max = integerList.get(0);
        for (int i = 1; i < integerList.size(); i++) {
            if (max < integerList.get(i)) {
                max = integerList.get(i);
            }
        }
        return max;
    }

    public static int calculateMinInList(List<Integer> integerList) {
        int min = integerList.get(0);
        for (int i = 1; i < integerList.size(); i++) {
            if (min > integerList.get(i)) {
                min = integerList.get(i);
            }
        }
        return min;
    }


    public static int calculateSumOfListUnderHundred() {
        int sum = 0;
        while (sum <= 100) {
            sum += IntScanner.scanIntX();
        }
        return sum;
    }

    public static List<String> createList(int naturalNumber) {
        List<String> initialList = new ArrayList<>();
        for (int i = 0; i < naturalNumber; i++) {
            initialList.add(" ");
        }
        return initialList;
    }

    public static void AddToList(int toAddToList, List<Integer> list) {
        list.add(toAddToList);
    }

}
