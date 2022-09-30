package example.src.com.practice.java.dates;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {
    
    public static void main(String[] args) {
        Instant ins =  Instant.now();

        System.out.println(ins);
        System.out.println(ins.getEpochSecond());
        Instant ins2 = Instant.ofEpochSecond(0);
        System.out.println(ins2);
        Duration duration = Duration.between(ins, ins2);
        System.out.println(duration.getSeconds());
    }
}
