package example.src.com.practice.java.optional;

import java.util.List;
import java.util.Optional;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class OrElseExample {
    
    private static List<User> users = UserDataBase.getAllUsers();
    private static String optOrElse(){
        Optional<User> optUser = Optional.ofNullable(users.get(1));
        return optUser.map(User::getName).orElse("Default");
    }

    private static User optOrElseGet(){
        Optional<User> optUser = Optional.empty();
        return optUser.orElseGet(User::new);
    }

    private static String optOrElseThrow(){
        Optional<User> optUser = Optional.empty();
        return optUser.map(User::getName).orElseThrow(()->new RuntimeException("No data available"));
    }

    public static void main(String[] args) {
        System.out.println(optOrElse());
        System.out.println(optOrElseGet());
        System.out.println(optOrElseThrow());
    }
}
