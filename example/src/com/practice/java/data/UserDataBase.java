package example.src.com.practice.java.data;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class UserDataBase {

    public static List<User> getAllUsers(){
        User user1 =  new User("Akim", 25, 'M', LocalDate.of(1997, Month.MARCH, 11), Arrays.asList("create","read","update","delete"));
        User user2 =  new User("Mary", 32, 'F', LocalDate.of(1990, Month.JUNE, 26), Arrays.asList("create","read","update"));
        User user3 =  new User("Steve", 26, 'M', LocalDate.of(1996, Month.JULY, 18), Arrays.asList("read","update"));
        User user4 =  new User("Ian", 27, 'M', LocalDate.of(1995, Month.MAY, 21), Arrays.asList("create","read","delete"));
        User user5 =  new User("Maria", 24, 'F', LocalDate.of(1998, Month.NOVEMBER, 15), Arrays.asList("update"));
        User user6 =  new User("Maribel", 25, 'F', LocalDate.of(1997, Month.APRIL, 28), Arrays.asList("read","update"));
        User user7 =  new User("Alexis", 24, 'M', LocalDate.of(1998, Month.AUGUST, 12), Arrays.asList("read","delete"));
        User user8 =  new User("Natalia", 23, 'F', LocalDate.of(1999, Month.SEPTEMBER, 17), Arrays.asList("read"));

        List<User> users = Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8);

        return users;
    }
    
}
