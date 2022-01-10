package com.algomethod.numbertheory.checkprimenumber;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long N = sc.nextLong();
            System.out.println(isPrime(N) ? "Yes" : "No");
        }
    }

    static boolean isPrime(long N) {
        if (N < 2)
            return false;
        for (long i = 2; i * i <= N; i++) {
            if (N % i == 0)
                return false;
        }
        return true;
    }

}