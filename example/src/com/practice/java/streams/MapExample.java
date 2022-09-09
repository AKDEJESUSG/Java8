package example.src.com.practice.java.streams;

import java.util.List;
import java.util.stream.Collectors;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class MapExample {

    private static List<User> users = UserDataBase.getAllUsers();

    private static List<String> nameList(List<User> u){
        return u.stream()
            .map(User::getName)
            .map(String::toUpperCase)
            .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(nameList(users));
    }
    
}
