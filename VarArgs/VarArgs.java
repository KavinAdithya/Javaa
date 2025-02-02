package com.techcrack.dsa;

public class VarArgs {
	static void printLength(int... values) {
		System.out.println(values.length);
	}
	
	public static void main(String[] args) {
		printLength();
	}
}
