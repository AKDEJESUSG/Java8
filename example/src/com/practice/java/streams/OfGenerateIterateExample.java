package example.src.com.practice.java.streams;

import java.util.Random;
import java.util.stream.Stream;

public class OfGenerateIterateExample {
    
    public static void main(String[] args) {
        Stream<String> s = Stream.of("akim","mary","steve");
        s.forEach(System.out::println);
        Stream.iterate(1, x->x*2).limit(5).forEach(System.out::println);
        Stream.generate(new Random()::nextInt).limit(5).forEach(System.out::println);
    }
}
