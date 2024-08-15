package com.techcrack.collectionFramework;

import java.util.*;
public class MapInterface {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Kavin");
        hashMap.put(2, "Dharani");
        hashMap.put(3, "KavinDharani");

//      1  System.out.println(hashMap);
//
//        hashMap.put(1, "Kavin_Adithya");
//
//        System.out.println(hashMap);
//
//        hashMap.put(null, "Ram");
//
//        System.out.println(hashMap);
//        hashMap.put(null, "JJK");
//
//        System.out.println(hashMap);

//       2 System.out.println(hashMap.size());
//
//       3 System.out.println(hashMap.isEmpty());
//
//       4 hashMap.clear();
//       5 hashMap.remove(null);
//       6 System.out.println(hashMap.get(1));
//
//       7 System.out.println(hashMap.containsKey(null));
//       8 System.out.println(hashMap.containsValue("Dharani"));
//
//       9 for(Integer key : hashMap.keySet()){
//            System.out.println(key);
//        }
//
//       10 Collection<String> collection = hashMap.values();
//
//        System.out.println(collection);
//
//        for(String value : collection)
//            System.out.println(value);
//
          Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
          for(Map.Entry<Integer, String>  entrySet : entries)
              entrySet.setValue("JDBC");
//            System.out.println(entrySet.getKey() + " " + entrySet.getValue() + " " + entrySet)
            System.out.println(hashMap);

        Map<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Kavin ", 43);
        treeMap.put("Dharani " , 19);
        treeMap.put("Kavin Dharani", 3);
        treeMap.put("Java Programming", 1995);
        treeMap.put("C programming", 1972);
        treeMap.put("Python Programming", 1991);

        System.out.println(treeMap);


    }
}
