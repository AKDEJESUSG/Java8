package example.src.com.practice.java.numericStreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class AggregateExample {
    
    public static void main(String[] args) {
        int sum =IntStream.rangeClosed(1, 50).sum();
        System.out.println("sum: "+sum);
        OptionalInt max = IntStream.rangeClosed(1, 50).max();
        System.out.println("max: "+(max.isPresent()?max.getAsInt():"none"));
        OptionalLong min = LongStream.rangeClosed(1, 100).min();
        System.out.println("min: "+(min.isPresent()?min.getAsLong():"none"));
        OptionalDouble average = IntStream.rangeClosed(1, 50).average();
        System.out.println("average: "+(average.isPresent()?average.getAsDouble():"none"));
    }
}
