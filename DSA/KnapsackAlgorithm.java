package com.techcrack.dsa;

public class KnapsackAlgorithm {
	static int findMax(int[] values, int[] weights, int index, int weight) {
		if (index == 0) {
			if (weights[index] > weight)
				return 0;
			return weights[index];
		}
		
		int notTake = findMax(values, weights, index - 1, weight);
		int take = Integer.MIN_VALUE;
		
		if (weights[index] <= weight) 
			take = values[index] + findMax(values, weights, index - 1, weight - weights[index]);
		
		return Math.max(notTake, take);
	}
	
	public static void main(String[] args) {
		int[] weight = {3, 2, 4};
		int[] values = {30, 40, 60};
		
		System.out.println(findMax(values, weight, weight.length - 1, 8));
	}
}
