package example.src.com.practice.java.dates;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
    
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();

        System.out.println(zdt);
        System.out.println(zdt.getOffset());
        System.out.println(zdt.getZone());
        System.out.println(ZonedDateTime.now(ZoneId.of("Europe/Athens")));
        LocalDateTime ldt = LocalDateTime.now(ZoneId.of("US/Pacific"));
        System.out.println(ldt);
        /**
         * ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
         */
       System.out.println(ldt.atZone(ZoneId.systemDefault()));
       System.out.println(ldt.atZone(ZoneId.of("America/Detroit")));
    }
}
