package example.src.com.practice.java.FuntionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class BiConsumerExample {

    private static String printdata= "%s %s %s=%s";

    private static BiConsumer<Integer,Integer> sum = (a,b)->{
        System.out.println(String.format(printdata, a,"+",b,(a+b)));
    };
    private static BiConsumer<Integer,Integer> sub = (a,b)->{
        System.out.println(String.format(printdata, a,"-",b,(a-b)));
    };
    private static BiConsumer<Integer,Integer> mul = (a,b)->{
        System.out.println(String.format(printdata, a,"*",b,(a*b)));
    };
    private static BiConsumer<Integer,Integer> div = (a,b)->{
        System.out.println(String.format(printdata, a,"/",b,(a/b)));
    };
    private static List<User> allUsers = UserDataBase.getAllUsers();
    
    private static void printNamePermission(){
        BiConsumer<String,List<String>> bCUser = (name,permissions)->{
            System.out.println(String.format("%s : %s", name,permissions));
        };
        allUsers.forEach(users ->bCUser.accept(users.getName(), users.getPermissions()));
    };
    public static void main(String[] args) {
        BiConsumer<String,String> bC = (a,b)->{
            System.out.println(String.format("a=%s b=%s", a, b));
        };
        bC.accept("java7","java8");

        sum.andThen(sub).andThen(mul).andThen(div).accept(6, 3);
        printNamePermission();
    }
}