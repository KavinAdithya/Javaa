package com.techcrack.dsa;

import java.io.PrintStream;

public class ExtendedEuclidean {
	private static PrintStream console = System.out;
	static int[] extendedGCD(int a, int b) {
		if (a == 0) {
			return new int[] {b, 0, 1};
		}
		
		int[] result = extendedGCD(b % a, a);
		int gcd = result[0];
		int x1 = result[1];
		int y1 = result[2];
		
		int x = y1 - (b / a) * x1;
		int y = x1;
		
		return new int[] {gcd, x, y};
	}
	
	public static void main(String[] args) {
		int a = 7;
		int b = 19;
		
		int[] result = extendedGCD(a, b);
		
		console.println("GCD : " + result[0]);
		console.println("x: " + result[1] + " , y: " + result[2]);
		
	}
}
