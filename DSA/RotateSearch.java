package com.techcrack.dsa;

public class RotateSearch {
	static int findPeak(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while (start < end) {
			int mid = start + (end - start + 1) / 2;
			
			if (arr[mid] >= arr[start]) start = mid;
			else end = mid - 1;
		}
		return end;
	}
	
	static int searchElement(int[] arr, int target, int start, int end) {
		
		while (start <= end) {
			int mid = start + (end - start) / 2;
			
			if (arr[mid] == target) return mid;
			else if (arr[mid] < target)  start = mid + 1;
			else end = mid - 1;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 3};
		int peak = findPeak(arr);
		int ans = 0;
		int target = 1;
		
		if (arr[peak] < target)
			ans = searchElement(arr, target, peak + 1, arr.length - 1);
		else
			ans = searchElement(arr, target, 0, peak);
		
		System.out.println(ans + " " + peak);
	}
}
