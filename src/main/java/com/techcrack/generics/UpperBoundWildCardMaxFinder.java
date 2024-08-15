package com.techcrack.generics;

import java.util.List;

public class UpperBoundWildCardMaxFinder {

    // Method to find the maximum element in a list with upper bound wildcards
    public static <T extends Comparable<? super T>> T findMax(List<T> list) {
        // Check for null or empty list
        if (list == null || list.isEmpty()) {
            return null;
        }

        // Initialize the maximum element as the first element in the list
        T maxElement = list.get(0);

        // Iterate over the list to find the maximum element
        for (T element : list) {
            if (element.compareTo(maxElement) > 0) {
                maxElement = element;
            }
        }



        // Return the maximum element, cast to T
        return (T) maxElement;
    }

    public static void main(String[] args) {
        // Example usage with Integers
        List<Integer> integerList = List.of(3, 1, 4, 1, 5, 9);
        Integer maxInteger = findMax(integerList);
        System.out.println("Maximum Integer: " + maxInteger);

        // Example usage with Doubles
        List<Double> doubleList = List.of(2.71, 3.14, 1.61, 0.577);
        Double maxDouble = findMax(doubleList);
        System.out.println("Maximum Double: " + maxDouble);

        // Example usage with Strings
        List<String> stringList = List.of("apple", "banana", "cherry", "date");
        String maxString = findMax(stringList);
        System.out.println("Maximum String: " + maxString);
    }
}
