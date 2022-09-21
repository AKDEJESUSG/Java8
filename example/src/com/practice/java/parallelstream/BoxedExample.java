package example.src.com.practice.java.parallelstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxedExample {
    
    private static int sequentialSum(List<Integer> list){
        long startTime = System.currentTimeMillis();
        int sum = list.stream().reduce(0, (a,b)->a+b);
        System.out.println(System.currentTimeMillis()-startTime);
        return sum;
    }

    private static int parallelSum(List<Integer> list){
        long startTime = System.currentTimeMillis();
        int sum = list.parallelStream().reduce(0, (a,b)->a+b);
        System.out.println(System.currentTimeMillis()-startTime);
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numList = IntStream.rangeClosed(1, 1000).boxed().collect(Collectors.toList());
        System.out.println("result: "+sequentialSum(numList));
        System.out.println("result: "+parallelSum(numList));
    }
}

