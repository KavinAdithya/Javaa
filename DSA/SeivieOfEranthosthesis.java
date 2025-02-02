package com.techcrack.dsa;

public class SeivieOfEranthosthesis {
	static int countPrime(int n) {
		
		boolean[] isPrime = new boolean[n + 1];
		
		isPrime[0] = true;
		isPrime[1] = true;
		
		for (int i = 2; i * i <= n; i++) {
			if (isPrime[i])
				continue;
			
			for (int j = i + i; j <= n; j += i) {
				if (! isPrime[j])
					isPrime[j] = true;
			}
		}
		
		int count = 0;
		
		for (int i = 2; i < n + 1; i++) {
			if (isPrime[i])
				continue;
			System.out.print(i + " ");
			count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("\nCount : " + countPrime(100000000));
	}
	
}
