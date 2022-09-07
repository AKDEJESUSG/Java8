package example.src.com.practice.java.FuntionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class BiPredicateExample {

    private static List<User> users= UserDataBase.getAllUsers(); 
    private static BiPredicate<Integer, Character> pAgeGen = (age, gender)->age>=25 && gender=='M';
    private static BiConsumer<String,List<String>> bCpro = (name, perm)-> {
        System.out.println(String.format("name: %s, perssions: %s", name, perm));
    };
    private static Consumer<User> cFil =(user->{
        if (pAgeGen.test(user.getAge(),user.getGender())) {
            bCpro.accept(user.getName(), user.getPermissions());
        }
    });
    public static void main(String[] args) {
        users.forEach(cFil);
    }
}
