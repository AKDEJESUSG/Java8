package example.src.com.practice.java.dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTimeExample {
    
    public static LocalTime parseTime(String time, DateTimeFormatter format){
        return LocalTime.parse(time,format);
    }
    public static LocalTime parseTime(String time, String format){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        return LocalTime.parse(time,dtf);
    }

    public static String formatTime(LocalTime time,String format){
        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern(format);
        return time.format(dtf);
    }
    public static void main(String[] args) {
        String timeISO = "12:12:20";
        String timeCustom = "12*12*20";
        String format = "HH*mm*ss";
        System.out.println(parseTime(timeISO, DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(parseTime(timeCustom, format));
        System.out.println(formatTime(LocalTime.now(), format));
    }
}
