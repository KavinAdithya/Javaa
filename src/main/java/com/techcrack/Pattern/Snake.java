import java.util.Scanner;

public class Snake {
    // Filling actual values of top row.
    static void top(int[][] arr, int row, int column, int end, int n) {
        for (int i = column; i <= end; i++)
            arr[row][i] = n++;
    }

    // Filling actual values of the right column.
    static void right(int[][] arr, int row, int column, int end, int n) {
        for (int i = row; i < end; i++)
            arr[i][column] = n++;
    }

    // Filling actual values of the bottom row.
    static void bottom(int[][] arr, int row, int column, int end,  int n) {
        for (int i = column; i > end; i--)
            arr[row][i] = n++;
    }

    // Filling actual values of the left column.
    static void left(int[][] arr, int row, int column, int end, int n) {
        for (int i = row; i > end; i--)
            arr[i][column] = n++;
    }

    // Filling the pattern.
    static void fillPattern(int[][] arr, int n) {
        // Top and Left Pointer
        int topAndLeft = 0;

        // Right And Down Pointer
        int rightAndDown = n - 1;

        int m = 1;
        int i = n - 1;

        while (topAndLeft <= rightAndDown) {

            // Filling the top and incrementing the m value which fill the array.
            top(arr, topAndLeft, topAndLeft, rightAndDown, m);
            m += i;
           
            // Filling the right of the array.
            right(arr, topAndLeft, rightAndDown, rightAndDown, m);
            m += i;
            
            // Filling the bottom of the array.
            bottom(arr, rightAndDown, rightAndDown, topAndLeft, m);
            m += i;

            // Filling the left of the array.
            left(arr, rightAndDown, topAndLeft, topAndLeft, m);
            m += i;

            // Incrementing the width of top and left.
            topAndLeft++;

            // Decrementing the width of the right and down.
            rightAndDown--;
            i -= 2;
        }
    }

    static void printArray(int[][] array) {
        int n = array.length;

        String[] space = new String[n];

        space[n - 1] = "";

        for (int i = array.length - 2; i > - 1; i--) {
            space[i] = space[i + 1] + " ";
        }

        // For Each To Iterate Array 
        for (int[] arr : array) {
            
            // Nested for each
            for (int a : arr)
                System.out.print( space[String.valueOf(a).length() - 1] + a + " ");

            System.out.println();
            System.out.println();
        }
    }

    // Driver For this Class

    public static void main(String[] args) {

        // Getting the Matrix Size or Pattern
        try (Scanner scanner = new Scanner(System.in)) {
            // Getting the Matrix Size or Pattern
            int n = scanner.nextInt();
            
            // Creating 2D Array or Matrix
            int[][] arr = new int[n][n];
            
            // Filling the pattern
            fillPattern(arr, n);
            
            // Printing Array
            printArray(arr);
            
        }
    }

}