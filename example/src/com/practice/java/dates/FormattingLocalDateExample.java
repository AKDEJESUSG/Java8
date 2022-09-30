package example.src.com.practice.java.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {
    
    public static LocalDate parseLocalDate(String date,DateTimeFormatter format){
        return LocalDate.parse(date,format);
    }
    public static LocalDate parseLocalDate(String date,String format){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        return LocalDate.parse(date,dtf);
    }

    public static String formatLocalDate(String format, LocalDate date){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        return date.format(dtf);
    }
    public static void main(String[] args) {
        String dateISO ="2022-09-30";
        String dateBasic = "20220928";
        String dateCustom = "2022|09|27";
        System.out.println(parseLocalDate(dateISO, DateTimeFormatter.ISO_DATE));
        System.out.println(parseLocalDate(dateBasic, DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(parseLocalDate(dateCustom, "yyyy|MM|dd"));
        String format ="yyyy.MM.dd";
        System.out.println(formatLocalDate(format, LocalDate.now()));
    }
}
