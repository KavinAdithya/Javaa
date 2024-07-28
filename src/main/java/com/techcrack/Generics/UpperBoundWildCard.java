package com.techcrack.Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UpperBoundWildCard {
    // Method is responsible to iterate through the list and print the elements
    // @param List<? extends> list of any type, but it must be a subclass of Number
    static void printElements(List<? extends Number> listOfElements) {
        // We Are Iterating the list using iterator
        for (Number number : listOfElements) {
            // printing the Element
            System.out.println(number);
        }


//        Iterator<? extends Number> list = listOfElements.iterator();
//
//        while (list.hasNext()) {
//            System.out.println(list.next());
//        }
    }

    // Driver method for Demonstration
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(34);
        list.add(56);
        list.add(123);

        List<Double> listOfDouble = new ArrayList<>();
        listOfDouble.add(12.45);
        listOfDouble.add(45.98);
        listOfDouble.add(90.00);

        printElements(listOfDouble);
        printElements(list);
    }
}
