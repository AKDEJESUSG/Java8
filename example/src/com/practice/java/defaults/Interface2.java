package example.src.com.practice.java.defaults;

public interface Interface2 extends Interface1{
    default void methodB(){
        System.out.println("method B");
    }

    @Override
    default void methodA() {
        System.out.println("method A: "+ Interface2.class);
    }
}
