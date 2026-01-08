package com.su2;

import java.util.Scanner;

public class SieveRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        if (start < 2) start = 2;

        boolean[] isPrime = new boolean[end + 1];

        // Step 1: Assume all numbers are prime
        for (int i = 0; i <= end; i++) {
            isPrime[i] = true;
        }

        isPrime[0] = false;
        isPrime[1] = false;

        // Step 2: Sieve process
        for (int p = 2; p * p <= end; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= end; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Step 3: Print primes in the given range
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
