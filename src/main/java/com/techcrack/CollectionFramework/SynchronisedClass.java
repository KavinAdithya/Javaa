package com.techcrack.CollectionFramework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class OwnThread extends Thread {
    private final Set<String> set;
    private final String message;
    OwnThread(Set<String> set, String message) {
        this.set = set;
        this.message = message;
    }
    @Override
    public void run(){
        set.add(message);
    }
}
public class SynchronisedClass {

    public static void main(String[] args) throws Exception{
        Set<String> set = new HashSet<>();
        Set<String> set1 = Collections.synchronizedSet(set);
        OwnThread ownThread = new OwnThread(set1, "Kavin");
        OwnThread ownThread1 = new OwnThread(set1, "Dharani");


        System.out.println(System.currentTimeMillis());
        ownThread1.start();
        ownThread.start();
        ownThread.join();
        ownThread1.join();
        System.out.println(System.currentTimeMillis());
        System.out.println(set);
    }
}
