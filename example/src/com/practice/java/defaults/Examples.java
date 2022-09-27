package example.src.com.practice.java.defaults;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class Examples {
    
    private static List<User> users = UserDataBase.getAllUsers();
    private static BiConsumer<String,Integer> userCon = (k,v)->System.out.println(k+" : "+v);

    private static void sortByName(List<User> list){
        list.stream().collect(Collectors.toMap(User::getName, User::getAge)).entrySet().stream().sorted(Entry.comparingByKey()).forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Akim","Mary","Steve",null,"Maria","Ian","Maribel");
        System.out.println("original order: "+stringList);
        
        stringList.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println("natural order: "+stringList);
        stringList.sort(Comparator.nullsLast(Comparator.reverseOrder()));
        System.out.println("reverse order: "+stringList);

        System.out.println("Original order:");
        users.stream().collect(Collectors.toMap(User::getName, User::getAge)).forEach(userCon);
        System.out.println("Name Natural order:");
        sortByName(users);
    }
}
