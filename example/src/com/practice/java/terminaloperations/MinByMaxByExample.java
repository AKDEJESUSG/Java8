package example.src.com.practice.java.terminaloperations;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class MinByMaxByExample {
    
    private static List<User> users = UserDataBase.getAllUsers();

    private static Optional<User> minByExample(){
        return users.stream().collect(Collectors.minBy(Comparator.comparing(User::getAge)));
    }
    private static Optional<User> maxByExample(){
        return users.stream().collect(Collectors.maxBy(Comparator.comparing(User::getAge)));
    }
    public static void main(String[] args) {
        System.out.println(minByExample());
        System.out.println(maxByExample());
    }

}
