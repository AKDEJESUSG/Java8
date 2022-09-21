package example.src.com.practice.java.optional;

import java.util.Optional;

public class PresentExample {

    public static void main(String[] args) {
        Optional<String> optString = Optional.ofNullable("hola");
        System.out.println(optString.isPresent());
        
        optString.ifPresent(System.out::println);
        optString.ifPresentOrElse(System.out::println,RuntimeException::new);
    }
}
