package example.src.com.practice.java.parallelstream;

import java.util.List;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class UserParallelExample {
    
    private static List<User> users = UserDataBase.getAllUsers();

    private static void sequential(){
        long startTime = System.currentTimeMillis();
        users.stream()
            .map(User::getPermissions)
            .flatMap(List::stream)
            .distinct().forEach(System.out::println);
        System.out.println("time: "+(System.currentTimeMillis()-startTime));
    }

    private static void parallel(){
        long startTime = System.currentTimeMillis();
        users.parallelStream()
            .map(User::getPermissions)
            .flatMap(List::stream)
            .distinct().forEach(System.out::println);
        System.out.println("time: "+(System.currentTimeMillis()-startTime));
    }
    public static void main(String[] args) {
        sequential();
        parallel();
    }
}
