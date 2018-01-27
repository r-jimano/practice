package me.yukicoder.lv1;

import java.util.Scanner;

public class No0476_2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			double sum = 0;

			for (int i = 0; i < n; i++) {
				sum += sc.nextDouble();
			}

			System.out.println(a == sum / n ? "YES" : "NO");
		}
	}
}