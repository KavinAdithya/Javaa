package com.techcrack.BasicQuestions;

public class BitwiseOperator {
    static void performBitwiseOperation(int a, int b) {
        // 2 - 0000 0010
        // 5 - 0000 0101

        System.out.println("Bitwise AND - " + (a & b));             // 0000 0000 -> 0
        System.out.println("Bitwise OR - " + (a | b));              // 0000 0111 -> 7
        System.out.println("Bitwise XOR - " + (a ^ b));             // 0000 0111 -> 7
        System.out.println("Bitwise COMPLEMENT - " + (~ a));        /*
                                                                        0000 0000 0000 0000 0000 0000 0000 0010
                                                                        1111 1111 1111 1111 1111 1111 1111 1101
                                                                        1111 1111 1111 1111 1111 1111 1111 0010
                                                                        1111 1111 1111 1111 1111 1111 1111 0011 -> -3
                                                                     */

        System.out.println("Bitwise Left Shift - " + (a << 2));      //  0000 1000 -> 8
        System.out.println("Bitwise Right Shift - " + (a >> 2));     //  0000 0000 -> 0


    }

    public static void main(String[] args) {
        performBitwiseOperation(2, 5);
    }

}
