package example.src.com.practice.java.defaults;

public class Client123 implements Interface3{
    
    @Override
    public void methodA() {
        System.out.println("method A: "+ Client123.class);
    }
    public static void main(String[] args) {
        Client123 c123 = new Client123();
        c123.methodA();
        c123.methodB();
        c123.methodC();
    }
}
