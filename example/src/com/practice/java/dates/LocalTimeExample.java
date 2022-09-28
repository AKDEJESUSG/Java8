package example.src.com.practice.java.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeExample {
    
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        
        LocalTime lt1= LocalTime.of(23, 23);
        System.out.println(lt1);

        LocalTime lt2= LocalTime.of(23, 23, 23);
        System.out.println(lt2);

        LocalTime lt3= LocalTime.of(23, 23, 33, 89898930);
        System.out.println(lt3);

        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());
        System.out.println(lt.getNano());
        System.out.println(lt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println(lt.with(LocalTime.MIDNIGHT));
        System.out.println(lt.with(ChronoField.HOUR_OF_DAY,12));
    }
}
