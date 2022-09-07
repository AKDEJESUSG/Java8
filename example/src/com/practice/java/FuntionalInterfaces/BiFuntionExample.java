package example.src.com.practice.java.FuntionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class BiFuntionExample {
    
    private static List<User> users = UserDataBase.getAllUsers();
    private static BiFunction<List<User>, Predicate<User>, Map<String,Integer>> bFUserAge = (user, predicate)->{
        Map<String, Integer> mUserAge = new HashMap<>();
        users.forEach(u->{
            if (predicate.test(u)) {
                mUserAge.put(u.getName(), u.getAge());
            }
        });
        return mUserAge;
    };

    public static void main(String[] args) {
        Map<String,Integer> mUserAge = new HashMap<>();
        mUserAge = bFUserAge.apply(users, PredicateAndConsumerExample.pAge.and(PredicateAndConsumerExample.pGen));
        System.out.println(mUserAge);   
    }
}
