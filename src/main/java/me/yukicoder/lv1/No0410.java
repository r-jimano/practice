package me.yukicoder.lv1;

import java.util.Scanner;

public class No0410 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] p = { sc.nextInt(), sc.nextInt() };
			int[] q = { sc.nextInt(), sc.nextInt() };

			double dist = (Math.abs(p[0] - q[0]) + Math.abs(p[1] - q[1])) / 2.0;
			System.out.println(dist);
		}
	}
}