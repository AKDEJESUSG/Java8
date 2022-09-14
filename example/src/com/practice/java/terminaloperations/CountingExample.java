package example.src.com.practice.java.terminaloperations;

import java.util.List;
import java.util.stream.Collectors;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class CountingExample {
    
    private static List<User> users = UserDataBase.getAllUsers();
    
    private static long countUser(){
        return users.stream().map(u->u.getAge()>=25).collect(Collectors.counting());
    }
    public static void main(String[] args) {
        System.out.println("users above 25 years old : "+countUser());
    }
}
