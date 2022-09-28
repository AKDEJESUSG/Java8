package example.src.com.practice.java.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateExample {
    
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println("date: "+ld);
        System.out.println("time: "+lt);
        System.out.println("date & time: "+ldt);
    }
}
