package com.techcrack;

import java.util.Scanner;

//Euclid's Division algorithm
public class GCDANDLCM {
    private static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=Integer.parseInt(scan.nextLine());
        int b=Integer.parseInt(scan.nextLine());

        int gcd=gcd(a,b);

        System.out.println("Gcd Of "+a+" and "+b+" is "+gcd);

        int lcm=(a*b)/gcd;

        System.out.println("Lcm of "+a+" and "+b+" is "+lcm);
    }
}
