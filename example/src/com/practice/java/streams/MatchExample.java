package example.src.com.practice.java.streams;

import java.util.List;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class MatchExample {

    private static List<User> users = UserDataBase.getAllUsers();
    private static boolean allMatch(List<User> list){
        return list.stream().allMatch(u->u.getAge()>=25);
    }
    private static boolean anyMatch(List<User> list){
        return list.stream().anyMatch(u->u.getAge()>=32);
    }
    private static boolean noneMatch(List<User> list){
        return list.stream().noneMatch(u->u.getAge()>=35);
    }
    public static void main(String[] args) {
        String form= "it is %s that %s than %s";
        System.out.println(String.format(form,allMatch(users),"all users are >=",25));
        System.out.println(String.format(form,anyMatch(users),"any user is >=",32));
        System.out.println(String.format(form,noneMatch(users),"none user is >=",35));
    }
}
