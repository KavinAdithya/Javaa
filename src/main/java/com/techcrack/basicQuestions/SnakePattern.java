package com.techcrack.basicQuestions;

import java.util.Scanner;

public class SnakePattern {

    static void top(int[][] arr, int row, int column, int end, int n) {
        for (int i = column; i < end; i++)
            arr[row][i] = n++;
    }

    static void right(int[][] arr, int row, int column, int end, int n) {
        for (int i = row; i < end; i++)
            arr[i][column] = n++;
    }

    static void bottom(int[][] arr, int row, int column, int end,  int n) {
        for (int i = column; i > end; i--)
            arr[row][i] = n++;
    }

    static void left(int[][] arr, int row, int column, int end, int n) {
        for (int i = row; i > end; i--)
            arr[i][column] = n++;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] arr = new int[n][n];

        fillPattern(arr, n);
        printArray(arr);
    }

    static void fillPattern(int[][] arr, int n) {
        int top = 0;
        int right = n - 1;
        int m = 1;

        while (top <= right) {
            top(arr, top, top, right, m);

             m += right;

             right(arr, top, right, right, m);

             m += right;

             bottom(arr, right, right, top, m);

             m += right;

             left(arr, right, top, top, m);

             m += right;

             top++;
             right--;

             printArray(arr);
        }
    }

    static void printArray(int[][] array) {
        for (int[] arr : array) {
            for (int a : arr)
                System.out.print(a + " ");
            System.out.println();
        }
    }
}
