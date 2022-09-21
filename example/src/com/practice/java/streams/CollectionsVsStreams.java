package example.src.com.practice.java.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {
    
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Akim");
        names.add("Mary");
        names.add("Adam");
        for (String string : names) {
            System.out.println(string);
        }
        for (String string : names) {
            System.out.println(string);
        }
        names.remove(2);
        System.out.println(names);

        Stream<String> sNames = names.stream();
        sNames.forEach(System.out::println);
        //sNames.forEach(System.out::println); error line no more than one execution 
    }
}
