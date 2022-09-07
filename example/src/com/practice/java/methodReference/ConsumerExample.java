package example.src.com.practice.java.methodReference;

import java.util.List;
import java.util.function.Consumer;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class ConsumerExample {
    
    private static List<User> users = UserDataBase.getAllUsers();
    private static Consumer<User> cUserPrint = System.out::println;
    private static void printUsersPer(User u){
        System.out.println(u.getName()+" = "+u.getPermissions());;
    };
    private static Consumer<User> cPer = ConsumerExample::printUsersPer;
    public static void main(String[] args) {
        users.forEach(cUserPrint);
        users.forEach(cPer);
    }
}