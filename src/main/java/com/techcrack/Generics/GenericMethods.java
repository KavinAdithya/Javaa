package com.techcrack.Generics;

import java.util.Arrays;
import java.util.List;

// This class is used to demonstrate the use of bounded type interface
public class GenericMethods {

    // @param List is containing generic of elements
    // We needed to find the maximum element in his list
    static <T extends Comparable<T>>T findMax(List<T> elements) {

        // Checking the given list not null and empty
        if (elements == null || elements.isEmpty())
            return null;

        // Initializing the first element as a maximum element in an array
        T maxElement = elements.get(0);

        // Iterating Over the array and finding the maximum element in an array
        for (T element : elements) {
            // Checking the stored value is greater among all true - negative value
            // False positive value, and then we need to store the new highest value
            if (element.compareTo(maxElement) > 0)
                maxElement = element;
        }

        // returning the maximum element in a list
        return maxElement;
    }

    // Driver method to demonstrate it
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 670, 2, 78, 5, 9);
        List<String> list1 = Arrays.asList("Kavin", "Dharani", "KavinDharani", "DharaniKavin", "Adithya", "Adithi");

        System.out.println("Maximum Element in a Array is : " + GenericMethods.<Integer>findMax(list));

        System.out.println("Maximum element in an list is : " + GenericMethods.findMax(list1));
    }
}
