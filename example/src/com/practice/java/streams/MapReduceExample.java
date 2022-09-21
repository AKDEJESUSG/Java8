package example.src.com.practice.java.streams;

import java.util.List;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class MapReduceExample {
    
    private static List<User> users = UserDataBase.getAllUsers();

    private static int acomulativeAge(List<User> list){
        return list.stream().map(User::getAge).reduce(0, Integer::sum);
    }
    
    public static void main(String[] args) {
        System.out.println(acomulativeAge(users));
    }
}
