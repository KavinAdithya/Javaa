package com.techcrack.java;

public class VarArguments {
	// Var args must be last parameter and only var args allowed per method
	static void printInputs(String name, int... arr) {
		System.out.print(name + " ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	
	public static void main(String... args) {
		int[] arr = {6, -1, 23, 90};
		String name = "java Programming";
		
		printInputs(name);
		printInputs(name, 1);
		printInputs(name, 1, 2);
		printInputs(name, 1, 2, 3);
		printInputs(name, 1, 2, 3, 4);
		printInputs(name, arr);
	}
}
