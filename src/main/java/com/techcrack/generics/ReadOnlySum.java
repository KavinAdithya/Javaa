package com.techcrack.generics;

import java.util.Arrays;
import java.util.List;

// This Class is used to Demonstrate the functionality of Read-only of wildcards and
// We Needed to sum it.
public class ReadOnlySum {

    // @param List is contained its element is an unknown type but its wildcard
    // It ensures the type safety and restricting the list to read-only
    // Returns sum of the list elements
    static double sumNumbers(List<? extends Number> list) {
        // Storing the Sum Values Here
        double sum = 0;

        // Iterating the every element in a list
        for (Number number : list)
            sum += number.doubleValue();

        // returning the sum value
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> listOfDouble = Arrays.asList(1.1, 1.2, 1.3, 1.4, 1.5);

        System.out.println("Sum of Integer Value is : " + sumNumbers(list));

        System.out.println("Sum of Double Value is : " + sumNumbers(listOfDouble));
    }

}
