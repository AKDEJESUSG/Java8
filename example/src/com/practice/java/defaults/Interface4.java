package example.src.com.practice.java.defaults;

public interface Interface4 {
    default void methodA(){
        System.out.println("method A: " + Interface1.class);
    }
}
