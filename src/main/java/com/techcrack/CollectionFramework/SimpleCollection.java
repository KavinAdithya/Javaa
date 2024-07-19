package com.techcrack.CollectionFramework;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class SimpleCollection {
    public static void main(String[] args){
        List<String>  list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        list.add("Grapes");

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }

}
