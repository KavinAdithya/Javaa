package com.techcrack.dsa;

import java.util.Arrays;

public class JobScheduling {
	private static Job[] jobs;
	private static int[] dp;
	private static int length;
	
	public static int findMaxProfit(int[] startTime, int[] endTime, int[] profit) {
		convertIntoObject(startTime, endTime, profit);
		Arrays.sort(jobs);
		
		return findMaxCost(0);
	}
	
	private static int findMaxCost(int index) {
		if (index >= length)
			return 0;
		
		if (dp[index] != -1)
			return dp[index];
		
		int curNego = findMaxCost(index + 1);
		int nextIndex = nextIndex(index, jobs[index].getEndTime());
		int curInclu =jobs[index].getProfit() + findMaxCost(nextIndex);
		
		return dp[index] = Math.max(curNego, curInclu);
	}
	
	private static void convertIntoObject(int[] startTime, int[] endTime, int[] profit) {
		length = startTime.length;
		
		jobs = new Job[length];
		
		for (int i = 0; i < length; i++) {
			jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
		}
		
		dp = new int[length];
		Arrays.fill(dp, -1);
		
	}
	
	private static int nextIndex(int index, int endTime) {
		int start = index + 1;
		int end = length;
		
		while (start < end) {
			int mid = start + (end - start) / 2;
			
			if (jobs[mid].getStartTime() >= endTime)
				end = mid;
			else
				start = mid + 1;
		}
		
		return end;
	}
}
