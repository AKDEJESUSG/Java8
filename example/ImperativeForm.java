package example;

import java.util.ArrayList;
import java.util.List;

public class ImperativeForm{

    public void printSumRangeOfNumbers(int limit) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
    public void uniqueValue(List<Integer> list){
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer item : list) {
            if(!uniqueList.contains(item)){
                uniqueList.add(item);
            }
        }
        System.out.println(uniqueList);
    }
}