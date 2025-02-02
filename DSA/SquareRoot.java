package com.techcrack.dsa;

public class SquareRoot {
	

	static double squareRoot(int n) {
		double start = 1.0;
		double end = n / 2;
		double increment = 1e-15;
		
		while (start < end) {
			double mid = (start + end) / 2;
				
			if (mid * mid <= n)
				start = mid + increment;
			else 
				end = mid - increment;
		}
		
		return start;
	}
	
	public static void main(String[] args) {
		int n = 16;
		
		System.out.println(square(n));
	}
	
	static double square(int n) {
		if (n == 0 || n == 1)
			return n;
		
		double start = 1;
		double end = n / 2;
		
		double presicion = 1e-15;
		
		while (end - start > presicion) {
			double mid = (start + end) / 2;
			
			
			if (mid * mid <= n)
				start = mid;
			else
				end = mid;
			
			System.out.println("Start : " + start + " End : " + end);
		}
		
		return start;
	}
}
