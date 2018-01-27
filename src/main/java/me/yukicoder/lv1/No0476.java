package me.yukicoder.lv1;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class No0476 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			double[] x = new double[n];

			for (int i = 0; i < n; i++) {
				x[i] = sc.nextDouble();
			}
			OptionalDouble sum = Arrays.stream(x).average();

			System.out.println(a == sum.getAsDouble() ? "YES" : "NO");
		}
	}
}