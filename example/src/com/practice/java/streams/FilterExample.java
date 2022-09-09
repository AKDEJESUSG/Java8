package example.src.com.practice.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

@SuppressWarnings (value="unchecked")
public class FilterExample {
    
    private static List<User> users = UserDataBase.getAllUsers();

    static Predicate<User> compositePredicate;

    private static Predicate<User> pFilterByAge(int age,Boolean asc){
        if(Boolean.TRUE.equals(asc)){
            return u->u.getAge()>=age;
        }else{
            return u->u.getAge()<=age;
        }
    }
    private static Predicate<User> pFilterByGender(char gender){
        return u->u.getGender()==gender;
    }
    private static Predicate<User> pFilterByPermissions(List<String> per){
        return u->u.getPermissions().containsAll(per);
    }
    private static Predicate<User> principalFilter(Map<Integer,Object> operation, String options){
        final List<Predicate<User>> predicateList = new ArrayList<>();
        operation.forEach((v,k)->{
                switch(v){
                    case 1:
                        predicateList.add(pFilterByAge((int)k, true));
                    break;
                    case 2:
                        predicateList.add(pFilterByGender((char)k));
                    break;
                    case 3:
                        predicateList.add(pFilterByPermissions((List<String>)k));
                    break;
                    default:
                }
        }); 
        compositePredicate = predicateList.get(0);

        predicateList.stream().skip(1).forEach(pre->{
            if(options.equalsIgnoreCase("and")){
                compositePredicate = compositePredicate.and(pre); 
            }else{
                compositePredicate = compositePredicate.or(pre); 
            }
        }
        );
        return compositePredicate;
    };
    private static List<User> filterByAge(List<User> u, int age){
        return u.stream()
            .filter(us->us.getAge()>=age)
            .collect(Collectors.toList());
    }
    private static List<User> filterByGender(List<User> u, char gender){
        return u.stream()
            .filter(us->us.getGender()==gender)
            .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(filterByAge(users, 25));
        System.out.println("***************");
        System.out.println(filterByGender(users, 'M'));
        System.out.println("************************");
        Map<Integer,Object> filter = new HashMap<>();
        filter.put(1, 25);
        filter.put(2, 'M');
        filter.put(3, Arrays.asList("create","delete"));

        users.stream().filter(principalFilter(filter,"and")).forEach(System.out::println);
    }
}
