package com.techcrack.generics;

import java.util.*;

// This class is used to demonstrate the raw types and its conversion to the generic types
public class RawTypeAndGenericType {

    // Demonstration
    public static void main(String[] args) {
        // Explicitly mentioning the type of list and makes run time error free by the compiler by
        // Checking its actual type at compile time preventing the termination of the program
        List<Integer> list = Arrays.asList(1, 3, 4, 5);

        // Here we are not explicitly mentioning its type and compiler cannot ensure the type safety at compile time
        List list1 = Arrays.asList(1,"2", 'd');

        try {
            // We are trying to convert the raw type with an actual type or generic type
            // It will lead to Run time Exception because the compiler cannot ensure the type safe
            // And so we are handling the exception to avoid the termination of program.
            list = (List<Integer>) list1;
            System.out.println(list);
        }
        catch(Exception e) {

            // Providing an exception message with clear to the user
            System.out.println("The Type cast is failed . The required is not matched " + e);
        }

        // if (list1 instanceof List<Integer>)
        // we Cannot because the compiler does know the type list1
        // And it cannot ensure the type, and so we cannot use it instead we can use on
        // correctly generically parameterized we can check but it was always true or always false
        // no use of using

        if (list instanceof List<Integer>) //  always True
            System.out.println("True its instance of List<Integer>");

    }
}
