package algorithms;

import java.util.Arrays;

public class Count {
    static int min;
    static int max;

    static void sort(int[] arr) {
        int[] hashArr = findHashArr(arr);

        for (int a : arr)
            hashArr[a - min]++;
        int k = 0;

        for (int i = 0; i < hashArr.length; i++) {
            int count = hashArr[i];

            while (count > 0) {
                arr[k] = i + min;
                k++;
                count--;
            }
        }
    }

    static int[] findHashArr(int[] arr) {
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        for (int a : arr) {
            min = Math.min(a, min);
            max = Math.max(max, a);
        }

        return new int[max - min + 1];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 23, 4, 90, 1, 990};
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
