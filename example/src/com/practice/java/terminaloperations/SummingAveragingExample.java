package example.src.com.practice.java.terminaloperations;

import java.util.List;
import java.util.stream.Collectors;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class SummingAveragingExample {
    
    private static List<User> users =  UserDataBase.getAllUsers();

    private static int sumAges(){
        return users.stream().collect(Collectors.summingInt(User::getAge));
    }

    private static double averageAges(){
        return users.stream().collect(Collectors.averagingInt(User::getAge));
    }
    public static void main(String[] args) {
        System.out.println(sumAges());
        System.out.println(averageAges());
    }
}
