package com.techcrack.generics;

import java.util.*;

// This class is used to Practise the Wildcards in Generics
public class Task1Helper {
    // Task 1
    // @param List of elements with a same type where We needed to print it
    // @return void -> Nothing
    // Major Task of this method to print the objects in the list
    static void printList(List<?> list) {
        // Printing the list Object
        System.out.println(list);

        // Iterating the elements in an array And printing the each elements sequentially


        for (Object object : list)
            System.out.print(object + " ");
    }


    // Driver For Demonstrating the list
    public static void main(String[] args) {
        System.out.println(Task1Helper.<Integer>concatenateString(Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(123, 45, 78, 90)));
        System.out.println("Maximum Element In a List : " + findMaximumElement(Arrays.asList(5, 89, 2, 349)));
    }


    // Task 2
    // @param list 1
    // @param list 2
    // This method is used to concatenate the two list into single list.
    static <T>List<T> concatenateString(List<? extends T> list1, List<? extends T> list2) {
        List<T> concatList = new ArrayList<>();
        concatList.addAll(list1);
        concatList.addAll(list2);

        return concatList;
    }

    static <T extends Comparable<T>>T findMaximumElement(List<? extends T> list) {
        if (list == null)
            return null;

        T object = list.get(0);

        for (T object1 : list) {
            if (object1.compareTo(object) > 0)
                object = object1;
        }

        return object;
    }



}
