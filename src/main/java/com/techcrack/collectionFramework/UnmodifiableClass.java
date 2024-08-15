package com.techcrack.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableClass {
    public static void main(String[] args){
        // Mutable list
        List<String> list = new ArrayList<>();

        // Inserting values to mutable list
        list.add("Kavin");
        list.add("Dharani");
        list.add("KavinDharani");

        // Creating the immutable list from a mutable list
        List<String> list1 = Collections.unmodifiableList(list);

        // Printing the lists before modification
        System.out.println(list);
        System.out.println(list1);

        // Handling Exception When we try to make changes on an immutable list
        try{
            // Adding an element to the mutable list
            list.add("DharaniKavin");
            // Same Element trying to insert on the immutable list
            list1.add("DharaniKavin");

        }catch(UnsupportedOperationException e){
            // Exception message
            System.out.println("Cannot modify the immutable list " + e);
        }


        // Printing the lists after the modification
        System.out.println(list);
        System.out.println(list1);

    }
}
