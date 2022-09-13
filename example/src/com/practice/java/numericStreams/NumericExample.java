package example.src.com.practice.java.numericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericExample {
    
    private static int sumNNumbers(List<Integer> list){
        return list.stream().reduce(0,(a,b)->a+b);
    }
    private static int sunNNumbersIntStreams(List<Integer> list){
        return list.stream().mapToInt(x->x).sum();
    }
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6);
        System.out.println(sumNNumbers(intList));
        System.out.println(sunNNumbersIntStreams(intList));
        System.out.println(IntStream.range(1, 50).sum());
        System.out.println(IntStream.rangeClosed(1, 50).sum());
        System.out.println(LongStream.rangeClosed(1,50).sum());
        System.out.println(IntStream.rangeClosed(1,50).asDoubleStream().sum());

    }
}
