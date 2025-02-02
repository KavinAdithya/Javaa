package com.techcrack.dsa.pattern;

public class P17 {
	private static void printTop(int n) {
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}
			
			for (int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
	
	private static void printBottom(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			
			for (int j = n - i; j > 0; j--) {
				System.out.print(j);
			}
			
			for (int j = 2; j <= n - i; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printTop(5);
		printBottom(5);
	}
}
