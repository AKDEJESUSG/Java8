package example.src.com.practice.java.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {
    
    public static LocalDateTime parseLocalDateTime(String dateTime, DateTimeFormatter dtf){
        return LocalDateTime.parse(dateTime, dtf);
    }
    public static LocalDateTime parseLocalDateTime(String dateTime, String format){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        return LocalDateTime.parse(dateTime,dtf);
    }
    public static String formatDateTime(LocalDateTime dateTime, String format){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        return dateTime.format(dtf);
    }
    public static void main(String[] args) {
        String dateTimeISO = "2022-09-30T15:53:21";
        String dateTimeCustom = "30/09/2022T15.53.21";
        String formatCustom = "dd/MM/yyyy'T'HH.mm.ss";
        System.out.println(parseLocalDateTime(dateTimeISO, DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(parseLocalDateTime(dateTimeCustom, formatCustom));
        System.out.println(formatDateTime(LocalDateTime.now(), formatCustom));
    }
}
