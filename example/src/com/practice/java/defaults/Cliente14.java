package example.src.com.practice.java.defaults;

public class Cliente14 implements Interface1,Interface4 {
    
    @Override
    public void methodA() {
        Interface1.super.methodA();
    }

    public static void main(String[] args) {
        Cliente14 c14 = new Cliente14();

        c14.methodA();
    }
}
