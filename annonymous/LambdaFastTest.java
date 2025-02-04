package com.techcrack.learnDSA.annotations;

public class LambdaFastTest {
	public static void main(String[] args) {
		long start = System.nanoTime();
		
		for (int i = 0; i < 1_000_000_00; i++) {
			Runnable run = () -> {};
		}
		
		// Time Taken : 5831001

		System.out.println("Time Taken : " + (System.nanoTime() - start));
		// Time Taken : 566200
		// Time Taken : 4000499 
	}
}	
