package com.techcrack.ZohoQuestions;


import javax.swing.*;

public class Rotation {
    // The method is used to rotate the given string into n characters either in left or right
    public String rotateString(String s, String rotationalAngle, int n) {

        // Handling the edge case in case of string s or rotational angle is null
        // Then we cannot perform anything
        if (s == null)
            return null;

        // In case a rotational angle is null, then we return the original string
        if (rotationalAngle == null)
            return s;

        // Calculating the length of the string
        int length = s.length();

        // HANDLING THE N because the rotational may be exceeding the string length
        n = n % length;

        // Store the result Which is immutable
        StringBuilder rotatedString = new StringBuilder();

        // checking the given angle is left or right
        if (rotationalAngle.equals("L-ROTATION")) {
            // splitting the end of string and storing on a result
            splitString(s, rotatedString, n, length);

            // String the start of the string on the result
            splitString(s, rotatedString, 0, n );
        } else {
            // Splitting the front of the string
            splitString(s, rotatedString, length - n, length);
            // Splitting the end of the string
            splitString(s, rotatedString, 0 , length - n );
        }

        // returning the result
        return rotatedString.toString();
    }

    // Dividing the string and storing on the string builder
    public void splitString(String s, StringBuilder rotatedString, int start, int end) {
       // Traversing the string and storing the result
        while (start < end) {
            rotatedString.append(s.charAt(start));
            start++;
        }
    }

    // Driver for demonstrating the rotational
    public static void main(String[] args) {
        Rotation rotation = new Rotation();
        String s = "ZOHOCORPORATION";
        String rotatedAngle = "L-ROTATION";
        String rotatedAngle1 = "R-ROTATION";
        String s1 = "HELLO";

        System.out.println(rotation.rotateString(s, rotatedAngle, 19));
        System.out.println(rotation.rotateString(s1, rotatedAngle1, 6));
    }

}
