package com.techcrack.Generics;

import java.util.*;

// Used to demonstrate the upper-bound wildcards
public class MaximumWildCard {

    // Finding the maximum element.
    // Element types are not restricted.
    public static <T extends Comparable<? super T>> T findMax(List<T> list) {
        // Check for a null or empty list
        if (list == null || list.isEmpty()) {
            return null;
        }

        // Initialize the maximum element as the first element in the list
        T maxElement = list.get(0);

        // Iterate over the list to find the maximum element
        for (T element : list) {
            // Comparing the Objects Based on the elements of generic types
            if (element.compareTo(maxElement) > 0) {
                maxElement = element;
            }
        }

        // return the maximum element in a list
        return maxElement;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(89, 1, 67, 23, 45);

        System.out.println("Maximum Element in a list is : " + findMax(list));

        List<Double> lisOfDouble = Arrays.asList(1.2, 1.202, 100.0, 1.2922, 100.09);

        System.out.println("Maximum Element in a list is : " + findMax(lisOfDouble));

        List<String> listOfString = Arrays.asList("Kavin", "KavinDharani", "Dharani");

        System.out.println("Maximum Element in a array is : " + findMax(listOfString));

    }
}
