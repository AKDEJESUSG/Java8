package example;

import java.util.Arrays;
import java.util.List;

public class MainExample {
    public static void main(String[] args){
        List<Integer> integerList = Arrays.asList(1,2,3,3,4,5,5,6,7,8,8,9,10);
        //imperative
        ImperativeForm imf = new ImperativeForm();
        imf.printSumRangeOfNumbers(100);
        imf.uniqueValue(integerList);
        //delarative
        DeclarativeForm df = new DeclarativeForm();
        df.printSumRangeOfNumbers(100);
        df.uniqueValue(integerList);
    }
}



