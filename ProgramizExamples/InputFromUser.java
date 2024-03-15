package ProgramizExamples;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class WorkSpace{
    public static void main(String []args){
        //Using Scanner class
        long start=System.currentTimeMillis();
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name=scan.nextLine();
        System.out.print("Entere Your Age : ");
        int age=Integer.parseInt(scan.next());
        System.out.println("Your Name is "+name+" And Your Age is "+age);
        System.out.println("May I Right??? ");
        long end=System.currentTimeMillis();
        scan.close();
        //Using BufferedReader class
        try{
            BufferedReader scan1=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Your Name : ");
            String name1=scan1.readLine();
            System.out.print("Entere Your Age : ");
            int age1 = Integer.parseInt(scan1.readLine());
            System.out.println("Your Name is "+name1+" And Your Age is "+age1);
            System.out.println("May I Right??");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        long endd=System.currentTimeMillis();
        System.out.println("Scanner Class Took "+(end-start)+" Milli Seconds To Complete The Process!!");
        System.out.println("BufferedReader Class Took "+(endd-end)+" Milli Seconds to Complete the Process!!");
    }
}