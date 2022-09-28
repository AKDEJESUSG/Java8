package example.src.com.practice.java.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    

    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println("date:"+ld);

        LocalDate ld2 = LocalDate.of(2022, 9, 28);
        System.out.println("date: "+ld2);
        
        LocalDate ld3 = LocalDate.ofYearDay(2018, 345);
        System.out.println("date: "+ld3);

        System.out.println(ld.getMonth());
        System.out.println(ld.getMonthValue());
        System.out.println(ld.getDayOfWeek());
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getDayOfYear());
        System.out.println(ld.get(ChronoField.DAY_OF_YEAR));
        System.out.println(ld.plusDays(2).getDayOfWeek());
        System.out.println(ld.minusDays(2).getDayOfWeek());
        System.out.println(ld.plusMonths(2).getMonth());
        System.out.println(ld.minusMonths(2).getMonth());
        System.out.println(ld.with(ChronoField.YEAR,2021));
        System.out.println(ld.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println(ld.minus(1,ChronoUnit.YEARS));
        System.out.println("leap year: "+ld.isLeapYear());
        System.out.println(ld.equals(ld2));
        System.out.println(ld.isAfter(ld2));
        System.out.println(ld.isBefore(ld2));
    }
}
