package example.src.com.practice.java.streams;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import example.src.com.practice.java.FuntionalInterfaces.PredicateAndConsumerExample;
import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class StreamsExample {

    private static List<User> users= UserDataBase.getAllUsers();
    public static void main(String[] args) {
        Map<String, LocalDate> mUser = users.stream()
            .peek((u->System.out.println("--"+u.getName())))//debug
            .filter(PredicateAndConsumerExample.pAge.and(PredicateAndConsumerExample.pGen))
            .peek((u->System.out.println("**"+u.getName())))//debug
            .collect(Collectors.toMap(User::getName, User::getBirthday));

        System.out.println(mUser);
    }
}
