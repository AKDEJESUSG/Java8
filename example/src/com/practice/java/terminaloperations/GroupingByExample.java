package example.src.com.practice.java.terminaloperations;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class GroupingByExample {
    
    private static List<User> users = UserDataBase.getAllUsers();

    private static Map<Character,List<User>> usersByGender(){
        return users.stream().collect(Collectors.groupingBy(User::getGender));
    }
    private static Map<String,List<User>> usersByCostume(){
        return users.stream().collect(Collectors.groupingBy(u->u.getAge()<=25?"young":"old"));
    }

    private static Map<Character,Map<String,List<User>>> groupingBy2(){
        return users.stream()
            .collect( Collectors.groupingBy(User::getGender, 
                Collectors.groupingBy(u->u.getAge()<=25?"young":"old")));
    }

    private static Map<Character,Double> groupingBy2Average(){
        return users.stream()
            .collect(Collectors.groupingBy(User::getGender, 
                Collectors.averagingInt(User::getAge)));
    }

    private static LinkedHashMap<String,Set<User>> groupingBy3(){
        return users.stream()
            .collect(Collectors.groupingBy(User::getName,
                LinkedHashMap::new,
                Collectors.toSet()));
    }
    private static Map<Character,User> oldestUser(){
        return users.stream()
            .collect(Collectors.groupingBy(User::getGender, 
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(User::getAge)), Optional::get)));
    }
    private static Map<Character,User> youngestUser(){
        return users.stream()
            .collect(Collectors.groupingBy(User::getGender, 
                Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(User::getAge)), Optional::get)));
    }
    public static void main(String[] args) {
        System.out.println(usersByGender());
        System.out.println(usersByCostume());
        System.out.println("******************");
        System.out.println(groupingBy2());
        System.out.println(groupingBy2Average());
        System.out.println(groupingBy3());
        System.out.println(oldestUser());
        System.out.println(youngestUser());
    }
}
