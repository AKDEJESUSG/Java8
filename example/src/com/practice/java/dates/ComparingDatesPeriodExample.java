package example.src.com.practice.java.dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {
    
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2020, 12, 14);
        LocalDate ld1 = LocalDate.of(2022, 12, 15);
        
        Period period = ld.until(ld1);

        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());

        Period period2 = Period.between(ld, ld1);

        System.out.println(period2.getDays());
        System.out.println(period2.getMonths());
        System.out.println(period2.getYears());
    }
}
