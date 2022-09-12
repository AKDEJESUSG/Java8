package example.src.com.practice.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import example.src.com.practice.java.data.User;
import example.src.com.practice.java.data.UserDataBase;

public class ReduceExample {

    private static int mult(List<Integer> list){
        return list.stream().reduce(1, (a,b)->a*b);
    }
    private static Optional<Integer> sum(List<Integer> list){
        return list.stream().reduce((a,b)->a+b);
    }
    private static List<User> users = UserDataBase.getAllUsers();

    private static Optional<User> getOlderUser(List<User> usr){
        return usr.stream().reduce((a,b)->a.getAge()>=b.getAge()?a:b);
    }
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7);

        System.out.println(mult(numList));
        Optional<Integer> res = sum(Arrays.asList());
        System.out.println(res.isPresent()?res.get():"the list is empty");
        Optional<User> resUser = getOlderUser(users);
        System.out.println(resUser.isPresent()?resUser.get():"error");
    }
    
}
