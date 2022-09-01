package example.src.com.practice.java.FuntionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class ConsumerExample{

    private static void printName(){
        Consumer<User> consumer = (user) -> System.out.println(user);  
        List<User> users = UserDataBase.getAllUsers();
        users.forEach(consumer);
    }
    public static void main(String[] args) {
        Consumer<String> c1 = (t) -> System.out.println(t.toUpperCase());
        c1.accept("java 8 ");
        printName();
    }
}
