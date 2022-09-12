package example.src.com.practice.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxExample {
    

    private static Optional<Integer> findMin(List<Integer> list) {
        return list.stream().reduce((a,b)->a<b?a:b);
    }

    private static Optional<Integer> findMax(List<Integer> list){
        return list.stream().reduce((a,b)->a>b?a:b);
    }
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(2,2,3,4,5,6);
        Optional<Integer> resMin = findMin(intList);
        Optional<Integer> resMax = findMax(intList);
        System.out.println("min: "+(resMin.isPresent()?resMin.get():"none"));
        System.out.println("max: "+(resMax.isPresent()?resMax.get():"none"));
    }
}
