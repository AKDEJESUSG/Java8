package example.src.com.practice.java.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapExample {

    private static List<Integer> mapToObj(){
        return IntStream.rangeClosed(1, 50).mapToObj(Integer::valueOf).collect(Collectors.toList());
    }

    private static Long mapToLong(){
        return IntStream.rangeClosed(1, 50).mapToLong(x->x).sum();
    }

    private static double mapToDouble(){
        return IntStream.rangeClosed(1, 50).mapToDouble(x->x).sum();
    }
    
    public static void main(String[] args) {
        System.out.println(mapToObj());
        System.out.println(mapToLong());
        System.out.println(mapToDouble());
    }
}
