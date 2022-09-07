package example.src.com.practice.java.FuntionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    private static UnaryOperator<String> uoConcat= s->s.concat(" add string");
    public static void main(String[] args) {
        System.out.println(uoConcat.apply("Java 8"));
    }
}
