package com.techcrack.dsa.pattern;

import java.util.Arrays;

@SuppressWarnings("unused")
public class P16 {

	private static int findCell(int row , int col) {
		int ans = 1;
		
		for (int i = 1; i <= col; i++) {
			ans *= (row - i);
			ans /= i; 
		}
		
		return ans;
	}
	
	
	private static long[] findRow(int row) {
		long[] rows = new long[row];
		rows[0] = 1;
		rows[row - 1] = 1;
		
		for (int i = 1; i < row; i++) {
			rows[i] = rows[i - 1] * (row - i);
			rows[i] /= i;
		}
		
		return rows;
	}
	
	private static void findPascal(int row) {
		for (int i = 1; i <= row; i++) {
			System.out.println(Arrays.toString(findRow(i)));
		}
	}
	
	public static void main(String[] args) {
		findPascal(20);
	}
}
