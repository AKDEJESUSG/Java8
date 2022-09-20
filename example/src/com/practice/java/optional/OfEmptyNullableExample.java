package example.src.com.practice.java.optional;

import java.util.Optional;

public class OfEmptyNullableExample {
    
    private static Optional<String> ofNullable(){
        return Optional.ofNullable(null);
    }
    private static Optional<String> of(){
        return Optional.of("value");
    }
    private static Optional<String> empty(){
        return Optional.empty();
    }
    public static void main(String[] args) {
        System.out.println(ofNullable().isPresent());
        System.out.println(ofNullable());
        System.out.println(of().isPresent());
        System.out.println(of());
        System.out.println(empty().isPresent());
        System.out.println(empty());
    }
}
