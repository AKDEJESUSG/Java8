package example.src.com.practice.java.FuntionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    private static BinaryOperator<Integer> bONum = (a,b)->a*b;
    public static Comparator<Integer> comp = (a,b)->a.compareTo(b);
    private static BinaryOperator<Integer> byMax = BinaryOperator.maxBy(comp);
    private static BinaryOperator<Integer> byMin = BinaryOperator.minBy(comp);
    private static String form = "%s %s %s = %s";
    public static void main(String[] args) {
        int n1=3;
        int n2=5;
        System.out.println(String.format(form, n1,"x", n2, bONum.apply(3, 4)));
        System.out.println(String.format(form,"max between", n1,"and "+ n2, byMax.apply(3, 5)));
        System.out.println(String.format(form,"max between", n1,"and "+ n2, byMin.apply(3, 5)));

    }
}
