package algorithms;

public class BinarySearch {
    static int search(int[] arr, int target) {
        // [1, 3, 4, 8, 10] // Target = 8

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target)  return mid;

            else if (arr[mid] < target) start = mid + 1;
            
            else end = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 8, 10};

        System.out.println(search(arr, 11));
    }
}