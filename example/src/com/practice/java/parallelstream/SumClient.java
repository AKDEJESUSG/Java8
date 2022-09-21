package example.src.com.practice.java.parallelstream;

import java.util.stream.IntStream;

public class SumClient {
    
    public static void main(String[] args) {
        Sum sum = new Sum();

        IntStream.rangeClosed(1, 1000)
            .forEach(sum::performSum);
        
        System.out.println(sum.getTotal());
        Sum sum2 = new Sum();
        IntStream.rangeClosed(1, 1000)
            .parallel()
            .forEach(sum2::performSum);

        System.out.println(sum2.getTotal());
    }
}
