package example.src.com.practice.java.terminaloperations;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class PartitioningByExample {
    private static List<User> users = UserDataBase.getAllUsers();

    private static Map<Boolean,List<User>> partitioningby1(){
        return users.stream().collect(Collectors.partitioningBy(u->u.getAge()>=25));
    }
    private static Map<Boolean,Set<User>> partitioningby2(){
        return users.stream().collect(Collectors.partitioningBy(u->u.getAge()>=25, Collectors.toSet()));
    }
    public static void main(String[] args) {
        System.out.println(partitioningby1());
        System.out.println(partitioningby2());
    }
}
