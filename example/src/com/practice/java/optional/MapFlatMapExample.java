package example.src.com.practice.java.optional;

import java.util.List;
import java.util.Optional;

import example.src.com.practice.java.data.Office;
import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class MapFlatMapExample {
    
    private static List<User> users = UserDataBase.getAllUsers();

    private static void optFilter(){
        Optional<User> optUser = Optional.ofNullable(users.get(3));
        optUser.filter(u->u.getAge()>25)
            .ifPresent(System.out::println);
    }

    private static void optMap(){
        Optional<User> optUser = Optional.ofNullable(users.get(0));
        optUser.filter(u->u.getAge()<30)
            .map(User::getName)
            .ifPresent(System.out::println);
    }

    private static void optFlapMap(){
        Optional<User> optUser = Optional.ofNullable(users.get(0));

        optUser.filter(u->u.getAge()<30)
            .flatMap(User::getOffice)
            .map(Office::getAddress)
            .ifPresent(System.out::println);
    }
    public static void main(String[] args) {
        optFilter();
        optMap();
        optFlapMap();
    }
}
