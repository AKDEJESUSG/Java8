package example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DeclarativeForm {
    
    
    public void printSumRangeOfNumbers(int limit){
        int sum =  IntStream.rangeClosed(1, limit).sum();
        System.out.println(sum);
    }

    public void uniqueValue(List<Integer> list){
        List<Integer> uniqueList =list.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);
    }
}
