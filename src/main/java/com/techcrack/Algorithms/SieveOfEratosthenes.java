package com.techcrack.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {


    static void printPrimeNumbers(int from, int end) {
        boolean[] isPrime = new boolean[end + 1];

        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i < end + 1; i++) {
            if (!isPrime[i])
                continue;

            for (int j = i * i; j < end + 1; j += i) {
                isPrime[j] = false;
            }

        }

        for (int i = from; i < end + 1; i++) {
            if (isPrime[i])
                System.out.print(i + " ");
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int from = scan.nextInt();

        int end = scan.nextInt();

        printPrimeNumbers(from, end);
    }
}
