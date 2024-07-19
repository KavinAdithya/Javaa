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

        System.out.println(fruits);

        System.out.println("Banana is " + fruits.contains("Banana"));

        System.out.println(fruits.size());

        System.out.print("Enter the object to be deleted : ");
        String remove = scanner.nextLine();

        System.out.println(fruits);

        System.out.println("After Removing banana : " + fruits.remove(remove));

        System.out.println(fruits);

        System.out.println(fruits.isEmpty());

        for(Object name : fruits.<String>toArray()){

        }

        fruits.clear();

        System.out.println(fruits);
    }
}
