package com.techcrack;

import java.util.Scanner;
public class Threads extends Thread {

    private void printYourName(String name,int length){
        if(length==0)
            return;
        System.out.print("'"+name+"',");
        printYourName(name,--length);
    }

    //Bitwise Operator
    public void bitwiseOperators(){
        int n=2>>1;
        int m=2<<1;
        int k=2&1;
        int j=2|1;
        int l=~2;
        int v=2^1;

        System.out.println("Bitwise AND "+k);

        System.out.println("Bitwise OR "+j);

        System.out.println("Bitwise NOT "+l);

        System.out.println("Bitwise XOR "+v);


        System.out.println("Right Shift of 2 is "+n+"\nLeft Shift of 2 is "+m);
    }


    //Driver Mode For This Thread
    @Override
    public void run(){
//        Scanner scan=new Scanner(System.in);
//
//        System.out.print("Enter Your Name = ");
//String name=scan.nextLine();
//
//        System.out.print("Enter Your Age = ");
//int age=scan.nextInt();
//
//        System.out.print("[");
//
//printYourName(name,age);
//
//        System.out.print("]");

//        Threads thread=new Threads();
//        thread.start();

        bitwiseOperators();
    }
}