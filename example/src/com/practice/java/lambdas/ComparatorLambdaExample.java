package example.src.com.practice.java.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {
        
        //legacy version
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("result: "+comparator.compare(3, 2));

        //java 8
        Comparator<Integer> comparator2 = (a, b)-> a.compareTo(b);

        System.out.println("result lambda: "+comparator2.compare(2, 2));
    }
    
}
