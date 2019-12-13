package me.yukicoder.lv1;

import java.util.Scanner;

/**
 * 1からNまでの合計を求めてください。
 * <br>
 * 入力は整数で与えられる。
 * 1≤N≤100
 */

public class No0480 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		int n = new Scanner(System.in).nextInt();
        int sum = n * (n + 1) / 2;
		System.out.println(sum);
	}
}