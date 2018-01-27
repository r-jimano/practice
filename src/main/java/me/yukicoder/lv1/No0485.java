package me.yukicoder.lv1;

import java.util.Scanner;

public class No0485 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			if (B % A == 0) {
				System.out.println(B / A);
			} else {
				System.out.println("NO");
			}
		}
	}
}