package example.src.com.practice.java.dates;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {
    
    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(12, 14, 14);
        LocalTime lt2= LocalTime.of(23, 12, 12);

        Long dif = lt.until(lt2, ChronoUnit.HOURS);
        System.out.println(dif);
        Duration duration = Duration.between(lt, lt2);

        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
    }
}
