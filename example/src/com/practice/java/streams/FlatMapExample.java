package example.src.com.practice.java.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class FlatMapExample {

    private static List<User> users = UserDataBase.getAllUsers();

    private static Set<String> permissionSet(List<User> u){
        return u.stream()
            .map(User::getPermissions)
            .flatMap(List::stream)
            .collect(Collectors.toSet());
    }
    private static List<String> permissionList(List<User> u){
        return u.stream()
            .map(User::getPermissions)
            .flatMap(List::stream)
            .collect(Collectors.toList());
    }
    private static List<String> permissionListUnic(List<User> u){
        return u.stream()
            .map(User::getPermissions)
            .flatMap(List::stream)
            .distinct()
            .sorted()
            .collect(Collectors.toList());
    }
    private static void countPermission(List<User> u){
        Long c = u.stream()
            .map(User::getPermissions)
            .flatMap(List::stream)
            .distinct().count();
        System.out.println(String.format("there are %s diferents permissions", c));
    }

    public static void main(String[] args) {
        System.out.println(permissionList(users));
        System.out.println("******************");
        System.out.println(permissionSet(users));
        System.out.println("*****************");
        countPermission(users);
        System.out.println("*******************");
        System.out.println(permissionListUnic(users));
    }
}
