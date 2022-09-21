package example.src.com.practice.java.optional;

import java.util.List;
import java.util.Optional;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class OptionalExample {

    private static List<User> users = UserDataBase.getAllUsers();
    
    private static String getUserName(User use){
        if(use!=null){
            return use.getName();
        }
        return null;
    }
    private static Optional<String> getUserNameOptional(User use){
        Optional<User> uOptional = Optional.ofNullable(use);
        if(uOptional.isPresent()){
            return uOptional.map(User::getName);
        }
        return Optional.empty();
    }
    public static void main(String[] args) {
        System.out.println(getUserName(users.get(0)));

        Optional<String> uOptional = getUserNameOptional(null);
        if(uOptional.isPresent())
            System.out.println(uOptional.get());
        else
            System.out.println("User is not present");
    }
}
