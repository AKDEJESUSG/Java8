package example.src.com.practice.java.defaults;

public interface Interface3 extends Interface2 {
    default void methodC(){
        System.out.println("method C");
    }
}
