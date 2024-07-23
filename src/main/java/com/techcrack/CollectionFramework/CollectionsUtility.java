package com.techcrack.CollectionFramework;

import java.util.*;

public class CollectionsUtility {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,11,2,3,4,5,663,3,3,21);

//        Collections.sort(list);
//        System.out.println(list);
//
//        //Collections.shuffle(list);
//
//        System.out.println(list);
//
//        System.out.println(" Index  : " + Collections.binarySearch(list, 1) + " Size : " + list.size());

        Collections.reverse(list);

        System.out.println(list);

        System.out.println("Frequency : " + Collections.frequency(list, 2));
        System.out.println("Max Element : " + Collections.max(list));
        System.out.println("Min Element : " + Collections.min(list));
        Collections.swap(list, 0, 1);

        System.out.println(list);
        Set<Integer> set = Collections.emptySet();

        System.out.println(set);
        set.add(1);

        System.out.println(set);
    }
}
