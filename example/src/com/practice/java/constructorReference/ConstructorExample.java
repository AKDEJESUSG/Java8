package example.src.com.practice.java.constructorReference;

import java.util.function.Supplier;

import example.src.com.practice.java.data.User;

public class ConstructorExample {
    
    private static Supplier<User> sUser = User::new;
    public static void main(String[] args) {
        System.out.println(sUser.get());
    }
}
