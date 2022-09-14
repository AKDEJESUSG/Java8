package example.src.com.practice.java.terminaloperations;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class MappingExample {
    private static List<User> users = UserDataBase.getAllUsers();


    public static void main(String[] args) {
        List<String> list = users.stream().collect(Collectors.mapping(User::getName, Collectors.toList()));

        Set<String> set = users.stream().collect(Collectors.mapping(User::getName, Collectors.toSet()));
        
        System.out.println(list);
        System.out.println(set);
    }
}
