package example.src.com.practice.java.FuntionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class ConsumerExample{

    private static List<User> allUsers = UserDataBase.getAllUsers();
    private static Consumer<User> cAllUsers = (user) -> System.out.println(user);  
    private static Consumer<User> cName = (user) -> System.out.print(user.getName());
    private static Consumer<User> cPermissions = (user) -> System.out.println(user.getPermissions()); 
    private static Consumer<User> cNamePer = cName.andThen(cPermissions);//consumer chaining

    public static void printName(){
        List<User> users = allUsers;
        users.forEach(cAllUsers);
    }
    public static void printPermissions(){
        allUsers.forEach(cNamePer);
    }
    public static void printPermissionsFilterAges(int age){
        System.out.println(String.format("Permissions of %s years old", age));
        allUsers.forEach(((user) -> {
            if(user.getAge()>=age){
                cNamePer.accept(user);
            }
        }));
    }
    public static void main(String[] args) {
        Consumer<String> c1 = (t) -> System.out.println(t.toUpperCase());
        c1.accept("java 8 ");
        printName();
        printPermissions();
        printPermissionsFilterAges(25);
    }
}
