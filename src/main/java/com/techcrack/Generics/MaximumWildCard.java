package com.techcrack.Generics;

import java.util.*;

// Used to demonstrate the upper-bound wildcards
public class MaximumWildCard {

    // Finding the maximum element.
    // Element types are not restricted.
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

        return maxElement;
    }
}
