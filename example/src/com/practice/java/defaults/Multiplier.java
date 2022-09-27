package example.src.com.practice.java.defaults;

import java.util.List;

public interface Multiplier {
    int multiply(List<Integer> list);

    default int sizeList(List<Integer> list){
        return list.size();
    }

    static boolean isEmpty(List<Integer> list){
        return list==null || list.isEmpty();
    }
}
