package example.src.com.practice.java.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        
        //legacy version
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable Interface");
            };
        };

        new Thread(runnable).start();
        //java 8 lambda
        Runnable runnable2 = ()-> System.out.println("Inside Runnable lamda");
        new Thread(runnable2).start();

        //direct lambda expresion
        new Thread(()->System.out.println("Inside Runnable direct lambda")).start();
    }
}
