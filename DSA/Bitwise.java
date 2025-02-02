package com.techcrack.dsa;

import java.io.PrintStream;

public class Bitwise {
	static PrintStream console = System.out;
	static void shift(int num) {
		int num1 = num >> 1;
		int num2 = num >>> 1;
		
		console.println("Num Value : " + num);	
		console.println("Num Binary Representation : " + toBinary(num));
		console.println("Num1 Value : " + num1);	
		console.println("Num1 Binary Representation : " + toBinary(num1));
		console.println("Num2 Value : " + num2);	
		console.println("Num2 Binary Representation : " + toBinary(num2));
//		console.println("Hexa Decimal : " + Integer.toHexString(Integer.(toBinary(num2))));
		
	}
	
	static String toBinary(int num) {
		return String.format("%32s", Integer.toBinaryString(num)).replace(' ', '0');
	}
	
	public static void main(String[] args) {
		shift(-3);
	}
}
