package com.techcrack.collectionFramework;

import java.util.concurrent.*;

public class ConcurrencyCollections {
    public static void main(String[] args){
////        ConcurrentMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
//        ConcurrentMap<String, Integer> concurrentMap = new ConcurrentSkipListMap<>();
//        concurrentMap.put("Kavin", 43);
//        concurrentMap.put("Dharani", 43);
//
//        System.out.println(concurrentMap);
//        concurrentMap.put("Kavin", 19);
//
//        System.out.println(concurrentMap);
//        concurrentMap.putIfAbsent("Kavin", 23);
//        concurrentMap.remove("Kavin",9);
//
//        System.out.println(concurrentMap);
//        concurrentMap.replace("Kavin", 19,433);
//
//        System.out.println(concurrentMap);

//        ConcurrentNavigableMap<String, Integer> concurrentNavigableMap = new ConcurrentSkipListMap<>();
//
//        concurrentNavigableMap.put("Av", 12);
//        concurrentNavigableMap.put("Dha", 43);
//        concurrentNavigableMap.put("Eee",89);
//        concurrentNavigableMap.put("De", 1);
//
//        System.out.println(concurrentNavigableMap);
//
//        System.out.println(concurrentNavigableMap.firstKey());
//
//        System.out.println(concurrentNavigableMap.lastKey());
//
//        System.out.println(concurrentNavigableMap.ceilingKey("B"));

        // CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        // Similar to an array list, but the object is synchronized

        // CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        // similar to set but its thread safe

        BlockingQueue<Integer> blockingDeque =  new ArrayBlockingQueue<Integer>(9);

        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();

        BlockingQueue<Integer> blockingQueue1 = new PriorityBlockingQueue<>();

        BlockingQueue<Delayed> blockingQueue2 = new DelayQueue<Delayed>();

    }
}
