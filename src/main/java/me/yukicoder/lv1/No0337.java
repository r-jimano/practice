package me.yukicoder.lv1;

import java.util.Scanner;

/**
 * 整数 N,P が与えられます． P=NP か P≠NP かを判定するプログラムを書いてください．
 */

public class No0337 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int N = sc.nextInt();
			int P = sc.nextInt();

			System.out.println((P == N * P) ? "=" : "!=");
		}
	}
}