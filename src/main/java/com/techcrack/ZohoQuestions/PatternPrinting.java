package com.techcrack.ZohoQuestions;

public class PatternPrinting {

    // printing the pattern
    public void printPattern(String[] array, int n) {
        // Calculating the length of the array
        int length = array.length;
        // Finding the difference between the n - length because based on the n only print the pattern
        int differenceLength = n - length;

        // calculating the end
        int end = differenceLength * 2 + length;
        int start = 0;
        int arrayPointer = 0;

        // Iterating from start to end
        while (start < end) {

            // If condition satisfies the array will print until it fails
            if (start >= differenceLength && start < differenceLength + length)
                System.out.println("*" + array[arrayPointer++] + "*");
            else {
                // printing the * character based on n
                for (int i = 0; i < n; i++)
                    System.out.print("*");
                System.out.println();
            }
            start++;
        }
    }

    public static void main(String[] args) {
        String[] array = {"abc", "kav", "dha"};
        PatternPrinting patternPrinting = new PatternPrinting();
        patternPrinting.printPattern(array, 6);
    }
}
