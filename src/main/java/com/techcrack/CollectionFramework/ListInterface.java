package com.techcrack.CollectionFramework;

import java.util.*;
public class ListInterface {
    public static void  main(String[] args){
        List<Integer> list = new ArrayList<>();

        list.add(19);
        list.add(43);
        list.add(3);

        list.add(1, 7);

        System.out.println(list);

        list.add(0, 1943);

        list.set(2, 34);

        System.out.println(list);

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);

        list.addAll(list1);

        System.out.println(list);

        list.remove(1);

        System.out.println(list);

        System.out.println(list.indexOf(3));
        System.out.println(list.lastIndexOf(3));

        System.out.println(list.subList(1, 3));

        System.out.println(list.get(0));
    }
}
