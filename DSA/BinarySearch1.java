package com.techcrack.dsa;

public class BinarySearch {
	static int search(int n) {
		long start = 1;
		long end = n / 2;
		
		while (start <= end) {
			long mid = (start + end) / 2;
			
			if (mid * mid <= n)
				start = mid + 1;
			else
				end = mid - 1;
		}
		
		return (int)end;
	}
	
	public static void main(String[] args) {
		int n = 49;
		System.out.println(search(n));
	}
}
