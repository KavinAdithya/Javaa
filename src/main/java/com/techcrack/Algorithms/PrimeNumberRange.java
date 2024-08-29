package com.techcrack.Algorithms;

// import java.util.Arrays;

public class PrimeNumberRange {
    static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n];

        isPrime[0] = true;
        isPrime[1] = true;

        for (int i = 2; i * i < n; i++) {

            if (! isPrime[i]) {
                for (int j = i  * i; j < n; j += i)
                    isPrime[j] = true;
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        int n = 50;
        boolean[] isPrime = sieveOfEratosthenes(n + 1);

        //System.out.prinztln(Arrays.toString(isPrime));

        for (int i = 0; i < n; i++) {
            if ( ! isPrime[i])
                System.out.print(i + " ");
        }
    }
}
