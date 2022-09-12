package example.src.com.practice.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LimitSkipExample {
    
    private static Optional<Integer> limit(List<Integer> list, int limit){
        return list.stream().limit(limit).reduce((a,b)->a+b);
    }
    private static Optional<Integer> skip(List<Integer> list, int init){
        return list.stream().skip(init).reduce((a,b)->a+b);
    }
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7);
        Optional<Integer> resLimit = limit(numList, 2);
        Optional<Integer> resSkip = skip(numList, 8);
        
        System.out.println("sum limit: "+(resLimit.isPresent()?resLimit.get():"none"));
        System.out.println("sum skip: "+(resSkip.isPresent()?resSkip.get():"none"));
    }
}
