package com.techcrack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerClass {
    static Scanner scan = new Scanner(System.in);

    static void inputOutput() {
        int age = scan.nextInt();
        double height = scan.nextDouble();
        int age1 = scan.nextInt();
        double height1 = scan.nextDouble();
        String name = scan.nextLine();

        System.out.println(age + " <- Age \n" + height + " <- Height \n" + name + " <- Height");

    }

    static void twoSum() {
        try {
            int a = Integer.parseInt(scan.nextLine());
            int b = Integer.parseInt(scan.nextLine());

            System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
        }
        catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        inputOutput();
        twoSum();
    }

}
