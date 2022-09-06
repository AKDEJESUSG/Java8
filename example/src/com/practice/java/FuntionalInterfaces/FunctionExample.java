package example.src.com.practice.java.FuntionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class FunctionExample {

    private static Function<String,String> fun = name->name.toUpperCase();
    private static Function<String,String> fAdd = name->name.concat(" add string");
    private static List<User> users = UserDataBase.getAllUsers();
    private static Function<List<User>, Map<String, Integer>> fUserAge = user->{
        Map<String, Integer> mUserAge = new HashMap<>();
        users.forEach(u->{
            if(PredicateAndConsumerExample.pAge.and(PredicateAndConsumerExample.pGen).test(u)){
                mUserAge.put(u.getName(), u.getAge());
            }
        });
        return mUserAge;
    };
    public static void main(String[] args) {
        System.out.println(fun.apply("java 8"));
        System.out.println(fun.andThen(fAdd).apply("java 8"));
        System.out.println(fun.compose(fAdd).apply("java 8"));
        Map<String, Integer> mpUser = fUserAge.apply(users);
        System.out.println(mpUser);
    }
}
