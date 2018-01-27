package me.yukicoder.lv1;

import java.util.Scanner;

public class No0486 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			int o = S.indexOf("OOO");
			int x = S.indexOf("XXX");

			if (x == -1 && o != -1) {
				System.out.println("East");
			} else if (o == -1 && x != -1) {
				System.out.println("West");
			} else if (o < x) {
				System.out.println("East");
			} else if (x < o) {
				System.out.println("West");
			} else {
				System.out.println("NA");
			}
		}
	}
}