package example.src.com.practice.java.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DatetoLocalDateExample {
    
    public static void main(String[] args) {
        /**
         * date to localdate 
         */
        Date date = new Date();
        System.out.println(date);
        LocalDateTime ldt = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println(ldt);
        LocalDate ld = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Date date2 = Date.from(ld.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(date2);

        /**
         * date sql to localdate
         */
        java.sql.Date date3 = java.sql.Date.valueOf(ld);
        System.out.println(date3);
        LocalDate date4 = date3.toLocalDate();
        System.out.println(date4);



    }
}
