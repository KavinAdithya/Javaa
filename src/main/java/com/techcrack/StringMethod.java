package com.techcrack;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args){
        String name = "Java Programming";
        String name1 = "C Programming";
        String name2 = "";

//        // 01
//        System.out.println("Index Of Character is : " + name.charAt(0));
//        // 02
//        System.out.println(name2.isEmpty());
//        // 03
//        System.out.println(name2.length());
//        // 04
//        System.out.println(name.substring(4));
        // 05
//        System.out.println(name.substring(4,8));
//        // 06
//        System.out.println(name.indexOf("a"));
//        // 07
//        System.out.println(name.lastIndexOf("a"));
//        // 08
//        System.out.println(name.equals(name1));
//        // 09
//        System.out.println(name.equalsIgnoreCase(name1));
//        // 10
//        System.out.println(name.compareTo(name1));
//        // 11
//        System.out.println(name.compareToIgnoreCase(name1));
//        // 12
//        System.out.println(name.toLowerCase());
//        // 13
//        System.out.println(name.toUpperCase());
//        name = "   " + name + "   ";
//        System.out.println(name);
//
//        // 14
//        System.out.println(name.trim());
//        // 15
//        System.out.println(name.toString());
//
//        //16
//        System.out.println(name.startsWith("Java"));
//        // 17
//        System.out.println(name.endsWith("ing"));
//        // 18
//        System.out.println(name.codePointAt(1));
//        // 19
//        System.out.println(name.codePointBefore(2));
//        // 20
//        System.out.println(name.contains("in"));
//        // 21
//        System.out.println(Integer.parseInt("12"));
//        // 22
//        System.out.println(String.valueOf(12));
//        // 23
//        System.out.println(Arrays.toString(name.split(" ")));
//        // 24
//        System.out.println(String.join("!", "a", "b","c"));
//        // 25
        System.out.println(name.replace("a","va"));
        // 26
        System.out.println(name.replaceAll("aj", "va"));
        // 27
        System.out.println(name.replaceFirst("a", "va"));

    }
}
