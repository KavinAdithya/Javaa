package com.techcrack.learnDSA.annotations;

import java.util.Scanner;
import java.util.function.Supplier;

public class TestClassLambdaCache {
	public static void main(String[] args) {
		int x = new Scanner(System.in).nextInt();
		Supplier<Integer> sp1 = () -> x + 1;
		Supplier<Integer> sp2 = () -> x + 1;
		
		Supplier<Integer> sp3 = () -> 1;
		Supplier<Integer> sp4 = () -> 1;
		
		System.out.println(sp1 == sp2);
		System.out.println(sp1.getClass() == sp2.getClass());
		
		System.out.println(sp3 == sp4);
		System.out.println(sp1.getClass().getName());
		System.out.println(sp2.getClass().getName());
		System.out.println(sp3.getClass().getName());
		System.out.println(sp4.getClass().getName());
		System.out.println(sp3.getClass().getName().equals(sp4.getClass().getName()));
//		+ " Name : " + ()sp1.getClass().getName());
		
	}
}
