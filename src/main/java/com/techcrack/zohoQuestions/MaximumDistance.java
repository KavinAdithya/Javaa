package com.techcrack.zohoQuestions;

/*
    * This Class is used to find the maximum distance in a string between same characters
    * And it will Demonstrate it
 */
public class MaximumDistance {
    /*
        * @param string which is used to find the maximum distance between the same character.
        * Using Hashing and storing the initial occurrence of a character,
        * We Iterate through the String to
        * Check whether the character occurs if it means to calculate the distance.
        * Check the already maximum value is greater or not it smaller means update with new maximum value.
        * In case of not mark hash with its index + 1;
        * @return the maximum distance
    */
    static int maximumDistance(String s) {
        // Handling Edge case
        if (s == null)
            return 0;

        // Hashing to Store the occurrence of the characters
        int[] indexStoring = new int[26];

        // Result of maximum distance
        int distance = 0;

        // Iterating the array through the index
        for (int i = 0; i < s.length(); i++) {
            // Retrieving the specific index and converting into a lower case.
            char ch = Character.toLowerCase(s.charAt(i));

            // Generating Index based on the character
            int index = ch - 'a';

            // Checking the character is an alphabet or not.
            if (ch < 'a' || ch > 'z')
                continue;

            // Checking is the character already occurs
            if (indexStoring[index] == 0)
                indexStoring[index] = i + 1;
            else {
                // Calculating the maximum distance
                int localMaximum = i - indexStoring[index];
                // Finding the maximum between local maximum and distance
                distance = Math.max(distance, localMaximum);
            }
        }

        // Returning the answer to invoker
        return distance;
    }

    // Driver method to demonstrate it
    public static void main(String[] args) {
        String s = "abacdeefghdei";
        String s1 = "abcbda";
        System.out.println("Maximum Distance : " + maximumDistance(s1));
    }
}
