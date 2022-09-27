package example.src.com.practice.java.defaults;

public interface Interface1 {
    
    default void methodA(){
        System.out.println("method A: " + Interface1.class);
    }
}
