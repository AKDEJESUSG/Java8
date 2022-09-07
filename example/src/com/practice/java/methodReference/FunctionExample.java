package example.src.com.practice.java.methodReference;

import java.util.function.Function;

public class FunctionExample {
    
    private static Function<String,String> toUpperCase = String::toUpperCase;
    private static Function<String,String> toUpperCase2 = s->s.toUpperCase();
    public static void main(String[] args) {
        System.out.println(toUpperCase.apply("java 8"));
        System.out.println(toUpperCase2.apply("java 8"));
    }
}
