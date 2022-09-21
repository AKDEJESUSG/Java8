package example.src.com.practice.java.terminaloperations;

import java.util.List;
import java.util.stream.Collectors;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class JoiningExample {
    
    private static List<User> users = UserDataBase.getAllUsers();
    private static String ex1(){
        return users.stream().map(User::getName).collect(Collectors.joining());
    }
    private static String ex2(){
        return users.stream().map(User::getName).collect(Collectors.joining("-"));
    }
    private static String ex3(){
        return users.stream().map(User::getName).collect(Collectors.joining("-","(",")"));
    }
    public static void main(String[] args) {
        System.out.println(ex1());
        System.out.println(ex2());
        System.out.println(ex3());
    }
}
