package com.techcrack.dsa;

import java.util.Arrays;

public class QuickSort {
	static void sort(int[] arr, int start, int end) {
		if (start >= end)
			return;
		
		int mid = partition(arr, start, end);
		sort(arr, start, mid);
		sort(arr, mid + 1, end);
	}
	
	static int partition(int[] arr, int start, int end) {
		int pivot = arr[start];
		
		int i = start;
		int j = end;
		
		while (i < j) {
			while (i < j && arr[i] < pivot) i++;
			while (i < j && arr[j] >= pivot) j--;
			
			if (i < j) {
				swap(arr, i, j);
				System.out.println(Arrays.toString(arr));
			}
		}	
		
		System.out.println(j);
		
		return j;
	}
	
	static void swap(int[] arr, int src, int des) {
		int temp = arr[src];
		arr[src] = arr[des];
		arr[des] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};
		
		sort(arr, 0, arr.length - 1);
		
		System.out.println(Arrays.toString(arr));
	}
}
