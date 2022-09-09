package example.src.com.practice.java.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class ComparatorExample {
    
    private static List<User> users = UserDataBase.getAllUsers();

    private static List<User> sortByName (List<User> u){
        return u.stream()
            .sorted(Comparator.comparing(User::getName))
            .collect(Collectors.toList());
    }
    private static List<User> sortByAge (List<User> u){
        return u.stream()
            .sorted(Comparator.comparing(User::getAge))
            .collect(Collectors.toList());
    }
    private static List<User> sortByAgeDesc (List<User> u){
        return u.stream()
            .sorted(Comparator.comparing(User::getAge).reversed())
            .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(sortByName(users));
        System.out.println("***************");
        System.out.println(sortByAge(users));
        System.out.println("***************");
        System.out.println(sortByAgeDesc(users));
    }
}
