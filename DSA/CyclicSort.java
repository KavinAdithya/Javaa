package algorithms;

import java.util.Arrays;

public class CyclicSort {
    static void sort(int[] arr) {
        int i = 0;
        int n = arr.length;

        while (i < n) {
            if (arr[i] >= 1 && arr[i] <= n && arr[i] != arr[arr[i] - 1])
                swap(arr, i, arr[i] - 1);
            else 
                i++;
        }
    }

    static void swap(int[] arr, int src, int des) {
        int temp = arr[src];
        arr[src] = arr[des];
        arr[des] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 5, 3, 4, 6, 1,77};
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
