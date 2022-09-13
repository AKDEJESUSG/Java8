package example.src.com.practice.java.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class FindExample {
    
    private static List<User> users = UserDataBase.getAllUsers();


    public static void main(String[] args) {
        Optional<User> optUserAny = users.stream().filter(u -> u.getAge()>=26).findAny();
        Optional<User> optUserFirst = users.stream().filter(u -> u.getAge()>=26).sorted(Comparator.comparing(User::getAge)).findFirst();
        System.out.println(optUserAny.isPresent()?optUserAny.get():"none");
        System.out.println(optUserFirst.isPresent()?optUserFirst.get():"none");
        
    }
}
