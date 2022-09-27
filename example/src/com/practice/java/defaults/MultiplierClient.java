package example.src.com.practice.java.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
    
    public static void main(String[] args) {
        Multiplier mul = new MultiplierImpl();

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        System.out.println("result: "+mul.multiply(list));
        System.out.println("size: "+mul.sizeList(list));
        System.out.println(Multiplier.isEmpty(null));
    }
}
