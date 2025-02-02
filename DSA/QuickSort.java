package algorithms;

import java.util.Arrays;

public class QuickSort {
    static void sort(int[] arr, int start, int end) {
        if (start >= end)
            return;
        
        int midIndex = partition(arr, start, end);

        sort(arr, start, midIndex - 1);
        sort(arr, midIndex + 1, end);
        
    }

    static int partition(int[] arr, int start, int end) {
        int j = start;

        for (int i = start; i < end; i++) {
            if (arr[i] <= arr[end]) {
                swap(arr, i, j);
                j++;
            }
        }

        swap(arr, end, j);

        return j;
    }

    static void swap(int[] arr, int src, int des) {
        int temp = arr[src];
        arr[src] = arr[des];
        arr[des] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 0, 9, -1, 1223, 546,  4, 67};
        sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
