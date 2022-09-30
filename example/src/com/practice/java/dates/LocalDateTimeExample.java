package example.src.com.practice.java.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {
    
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt);
        System.out.println(LocalDateTime.of(2020, 4, 12, 6, 22, 13,921312));
        System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.now()));
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.get(ChronoField.DAY_OF_YEAR));

        LocalDate ld = LocalDate.of(2020, 12, 21);
        LocalTime lt = LocalTime.of(23, 12, 15);
        LocalDateTime ldt2 = LocalDateTime.of(ld, lt);
        System.out.println(ldt2);
        LocalDateTime ldt3 = lt.atDate(ld);
        System.out.println(ldt3);
        System.out.println(ldt3.toLocalDate());
        System.out.println(ldt3.toLocalTime());
    }
}
