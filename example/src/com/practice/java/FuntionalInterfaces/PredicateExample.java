package example.src.com.practice.java.FuntionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class PredicateExample {
    
    private static Predicate<Integer> p = i -> i%2==0;
    private static Predicate<Integer> p1 = i -> i%5==0;
    private static List<User> users= UserDataBase.getAllUsers(); 

    private static void printUserFilterAge(int age,char gender) {
        Predicate<User> pU = (u) -> u.getAge()>=age;
        Predicate<User> pUG = u -> u.getGender()=='M';
        users.forEach(((user) ->{
            if(pU.and(pUG).test(user))
            System.out.println(user);
        }));
    }
    public static void main(String[] args) {
        String message = "%s statement: %s";

        System.out.println(String.format(message, "if", p.and(p1).test(10)));
        System.out.println(String.format(message, "or", p.or(p1).test(8)));
        System.out.println(String.format(message, "negate", p.or(p1).negate().test(3)));
        
        printUserFilterAge(25,'M');
    }
}

