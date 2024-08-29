package com.techcrack.Algorithms;

public class SquareRootBinarySearch {
    public static double squareRootBinarySearch(double number, double tolerance) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot compute square root of a negative number");
        }
        if (number == 0 || number == 1) {
            return number;
        }

        double start = 0;
        double end = number;
        double mid = 0;

        while ((end - start) > tolerance) {
            mid = (start + end) / 2;
            double square = mid * mid;

            if (Math.abs(square - number) < tolerance) {
                return mid;
            } else if (square < number) {
                start = mid;
            } else {
                end = mid;
            }
        }

        return mid;
    }

    public static void main(String[] args) {
        double number = 25;
        double tolerance = 1e-10;
        System.out.println("Square root of " + number + " using Binary Search: " + squareRootBinarySearch(number, tolerance));
        
        number = 2;
        System.out.println("Square root of " + number + " using Binary Search: " + squareRootBinarySearch(number, tolerance));
    }
}
