package example.src.com.practice.java.defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier{
    @Override
    public int multiply(List<Integer> list) {
        return list.stream().reduce(1,(x,y)->x*y);
    }
    @Override
    public int sizeList(List<Integer> list) {
        System.out.println("override method");
        return Multiplier.super.sizeList(list);
    }
}
