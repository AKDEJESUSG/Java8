package example.src.com.practice.java.parallelstream;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class ParallelExample {

    private static long checkPerformance(IntSupplier sup, int times){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            sup.getAsInt();
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }
    
    private static int sequentialSum(){
        return IntStream.rangeClosed(1, 100000).sum();
    }

    private static int parallelSum(){
        return IntStream.rangeClosed(1, 100000).parallel().sum();
    }
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(checkPerformance(ParallelExample::sequentialSum,20));
        System.out.println(checkPerformance(ParallelExample::parallelSum,20));
    }
}
