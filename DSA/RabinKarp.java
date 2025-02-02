package com.techcrack.dsa;

public class RabinKarp {
	public static int PRIME = 101;
	
	private static double calculateHashValue(String str, int end) {
		double hashValue = 0.0;
		
		for (int i = 0; i < end; i++) {
			hashValue += str.charAt(i) * Math.pow(PRIME, i);
		}
		
		return hashValue;
	}
	
	private static double updateHashValue(char oldChar, char newChar, double hashValue, int patternLength) {
		hashValue = (hashValue - oldChar) / PRIME;
		
		hashValue += newChar * Math.pow(PRIME, patternLength - 1);
		
		return hashValue;
	}
	
	private static boolean isPatternMatch(String text, String pattern, int start, int end) {
		int i = 0;
		
		while (start + i < end && text.charAt(start + i) == pattern.charAt(i)) i++;

		return i + start == end;
	}
	
	public static void search(String text, String pattern) {
		int n = text.length();
		int m = pattern.length();
		
		double patternHashValue = calculateHashValue(pattern, m);
		double textHashValue = calculateHashValue(text, m);
		
		for (int i = 0; i <= n - m; i++) {
			if (patternHashValue == textHashValue && isPatternMatch(text, pattern, i, i + m)) {
				System.out.println("Pattern Found at index : " + i);
			}
			
			if (i >= n - m) continue;
			
			textHashValue = updateHashValue(text.charAt(i), text.charAt(i + m), textHashValue, m);
		}
	}
	
	public static void main(String[] args) {
		String text = "JavaProgavava";
		String pattern = "ava";
		search(text, pattern);
	}
}
