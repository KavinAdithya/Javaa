package com.techcrack.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CollectionInterface {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Collection<String> fruits = new ArrayList<>();
        String fruit = scanner.nextLine();

        do{
            fruits.add(fruit);
            fruit = scanner.nextLine();
        }while(fruit.compareToIgnoreCase("end" ) != 0);

//        System.out.println(fruits);
//
//        System.out.println("Banana is " + fruits.contains("Banana"));
//
//        System.out.println(fruits.size());
//
//        System.out.print("Enter the object to be deleted : ");
//        String remove = scanner.nextLine();
//
//        System.out.println(fruits);
//
//        System.out.println("After Removing banana : " + fruits.remove(remove));
//
//        System.out.println(fruits);
//
//        System.out.println(fruits.isEmpty());

//        for(String name : fruits.toArray(new String[0])){
//            System.out.println(name);
//        }
//
//        fruits.clear();
//
//        System.out.println(fruits);


        System.out.println("Enter the Second Group Details : ");
        Collection<String>  fruits2 = new ArrayList<>();

        String fruit1 = scanner.nextLine();
        do{
            fruits2.add(fruit1);
            fruit1 = scanner.nextLine();

        }while(!fruit1.equalsIgnoreCase("end"));

        System.out.println("Add All : " + fruits2.addAll(fruits));

        System.out.println("Contains All : " + fruits2.containsAll(fruits));

        System.out.println(fruits2 + " \nRetains All : " + fruits2.retainAll(fruits) + " \n" + fruits2);

        System.out.println("Remove All : " + fruits2.removeAll(fruits) + " \n"  + fruits2);
    }
}
