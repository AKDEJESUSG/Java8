package example.src.com.practice.java.FuntionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class PredicateAndConsumerExample {
    
    private static List<User> users= UserDataBase.getAllUsers(); 
    private static Predicate<User> pAge = (user->user.getAge()>=25);
    private static Predicate<User> pGen = (user->user.getGender()=='M');
    private static BiConsumer<String,List<String>> bCpro = (name, perm)-> {
        System.out.println(String.format("name: %s, perssions: %s", name, perm));
    };
    private static Consumer<User> cFil =(user->{
        if (pAge.and(pGen).test(user)) {
            bCpro.accept(user.getName(), user.getPermissions());
        }
    });
    
    public static void main(String[] args) {
        users.forEach(cFil);
    }
}
