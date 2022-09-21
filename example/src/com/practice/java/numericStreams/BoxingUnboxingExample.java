package example.src.com.practice.java.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnboxingExample {
    
    private static List<Integer> boxin(){
        return IntStream.rangeClosed(1, 10)
            .boxed()
            .collect(Collectors.toList());
    }
    private static int unBoxing(List<Integer> list){
        return list.stream().mapToInt(Integer::intValue).sum();
    }
    public static void main(String[] args) {
        boxin().stream().forEach(System.out::println);
        System.out.println("sum: "+unBoxing(boxin()));
    }
}
