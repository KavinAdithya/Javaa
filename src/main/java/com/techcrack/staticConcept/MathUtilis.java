package com.techcrack.staticConcept;

// Utility class for performing the arithmetic operations.
// Arithmetic Operations
// addition(a, b) -> Adding of two numbers
// subtraction(a, b) -> Subtraction of two numbers
// multiplication(a, b) -> Multiplication of two numbers
// division(a, b) -> Division of two numbers
// Making the class to avoid inheriting

public final class MathUtilis {

    // Default Constructor
    private MathUtilis() {
        // Avoiding the Object Creation using encapsulated constructor
    }

    // @param number1
    // @param number2
    // @return addition of two numbers
    public static int addition(int a, int b) {
        return a + b;
    }

    // @param number1
    // @param number2
    // @return subtraction of two numbers
    public static int subtraction(int a, int b) {
        return a - b;
    }

    // @param number1
    // @param number2
    // @return multiplication of two numbers.

    public static int multiplication(int a, int b) {
        return a * b;
    }

    // @param number1
    // @param number2
    // @return division of two numbers.
    public static double division(int a, int b) {
        return (double) a / b;
    }

    // Driver Method
    public static void main(String[] args) {
        System.out.println("Addition : " + MathUtilis.addition(2, 3));
        System.out.println("Subtraction : " + MathUtilis.subtraction(8, 5));
        System.out.println("Multiplication : " + MathUtilis.multiplication(7, 9));
        System.out.println("Division : " + MathUtilis.division(18, 4));
    }

}
