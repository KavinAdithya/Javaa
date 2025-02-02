package com.techcrack.dsa;

public class Prime {
	static int countPrime(int n) {
		
		boolean[] isPrime = new boolean[n + 1];
		
		isPrime[0] = true;
		isPrime[1] = true;
		
		for (int i = 2; i * i <= n + 1; i++) {
			if (isPrime[i])
				continue;
			
			for (int j = i + i; i <= n + 1; j += i) {
				if (! isPrime[j])
					isPrime[j] = true;
			}
		}
		
		int count = 0;
		
		for (int i = 2; i < n + 2; i++) {
			if (isPrime[i])
				continue;
			System.out.println(i);
			count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(countPrime(10));
	}
}
