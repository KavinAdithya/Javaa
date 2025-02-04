package com.techcrack.learnDSA.annotations;

public class LambdaVsAnnonymous {
	public static void main(String[] args) {
		long n = System.nanoTime();
		
		for (int i = 0; i < 1_000_000_00; i++) {
			Runnable run = new Runnable() {
				@Override
				public void run() {
					
				}
			};
		}
		// Time Taken : 2235200
//		Time Taken : 5831001

		System.out.println("Time Taken : " + (System.nanoTime() - n));
	}
}
