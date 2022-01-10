package com.algomethod.numbertheory.countprimenumber;

import java.util.*;

public class Main {
  public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        int N = sc.nextInt();
        boolean[] isPrimeArr = doEratosthenes(N+1);//0toN

        int num = 0;
        for (int i = 2; i < isPrimeArr.length; i++) {
            num = (isPrimeArr[i]) ? num+1 : num;
        }
        System.out.println(num);
    }
  }

  static boolean[] doEratosthenes(int N) {
    boolean[] isPrime = new boolean[N];
    Arrays.fill(isPrime, true);
    isPrime[0] = false;
    isPrime[1] = false;

    for (int i = 2; i < N; i++) {
        if(!isPrime[i]) continue;
          // 倍数をふるい落とす
          for (int composite = i + i; composite < N; composite += i) {
            isPrime[composite] = false;
        }
    }
    return isPrime;
  }
  
  static boolean isPrime(int N) {
    if (N < 2) return false;
    for (long i = 2; i * i <= N; i++) {
        if (N % i == 0) return false;
    }
    return true;
  }
}