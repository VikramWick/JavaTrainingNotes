package generics;

import java.util.*;

public class WildCards {

    // Unbounded wildcard
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }

    // Upper bounded wildcard
    public static void printNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }

    // Lower bounded wildcard
    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("A", "B", "C");
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Number> numList = Arrays.asList(1.5, 2, 3.7);

        System.out.println("Unbounded wildcard:");
        printList(strList);

        System.out.println("\nUpper bounded wildcard:");
        printNumbers(numList);

        System.out.println("\nLower bounded wildcard:");
        List<Object> objList = new ArrayList<>();
        addIntegers(objList);
    }
}