package com.techcrack.dsa;

public class Driver {
	 public static void main(String[] args) {
	   int[] startTime = {1, 2, 3, 4, 5};
	   int[] endTime = {2, 3, 4, 5, 6};
	   int[] profit = {10, 20, 7, 100, 20};
	   int result = JobScheduling.findMaxProfit(startTime, endTime, profit);

	   System.out.println("Profit : " + result);
	 }
//	public static void main(String[] args) {
//		Job[] jobs = {new Job(1, 2, 10), new Job(-1, 3, 20)};
//
//		System.out.println(Arrays.toString(jobs));
//		
//		Arrays.sort(jobs);
//
//		System.out.println(Arrays.toString(jobs));
//	}
}
