package example.src.com.practice.java.FuntionalInterfaces;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class SupplierExample {
    private static Supplier<User> sNewUser = ()->{
        return new User("new", 99, 'M', LocalDate.of(1999, Month.JULY, 9), Arrays.asList("create"));
    };
    private static Supplier<List<User>> sUsers = () -> UserDataBase.getAllUsers();
    public static void main(String[] args) {
        System.out.println(sNewUser.get());
        System.out.println("********");
        System.out.println(sUsers.get());
    }
}
