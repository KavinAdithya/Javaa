package algorithms;

import java.util.Arrays;

public class MergeSort {
    static void sort(int[] arr, int start, int end) {
        if (start >= end)
            return;
        
        int mid = (start + end) / 2;

        sort(arr, start, mid);
        sort(arr, mid + 1, end);

        mergeIt(arr, start, mid, end);
    }

    static void mergeIt(int[] arr, int start, int mid, int end) {
        int rightLen = end - mid;
        int leftLen = mid - start + 1;

        
        int[] rightArr = new int[rightLen];
        int[] leftArr = new int[leftLen];
        
        for (int i = 0; i < leftLen; i++) {
            leftArr[i] = arr[i + start];
        }

        for (int i = 0; i < rightLen; i++) {
            rightArr[i] = arr[i + mid + 1];
        }

        int i = 0;
        int j = 0;
        int k = start;

        while (i < leftLen && j < rightLen) {
            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            }
            else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < leftLen) {
            arr[k] = leftArr[i];
            k++;
            i++;
        }

        while (j < rightLen) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 12, 34, 78, 8};

        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}