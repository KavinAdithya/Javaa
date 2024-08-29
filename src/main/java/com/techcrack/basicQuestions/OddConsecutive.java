package com.techcrack.basicQuestions;

import java.util.Scanner;

public class OddConsecutive
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int[] values = new int[n];
		
		for (int i = 0; i < n; i++)
		    values[i] = scanner.nextInt();
		   
		 int leftPointer = 0;
		 int rightPointer = 0;
		 
		 while (rightPointer < n) {
		     if (values[rightPointer] % 2 != 0) {
		         
		         if (rightPointer - leftPointer + 1 == 3) {
		             System.out.println("TRUE");
		             return;
		         }
		     }
		     else
		        leftPointer = rightPointer + 1;
		      rightPointer++;
		 }
		 
		 System.out.println("False");
	}
}
