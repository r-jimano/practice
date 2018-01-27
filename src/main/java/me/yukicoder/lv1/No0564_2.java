package me.yukicoder.lv1;

import java.util.Arrays;
import java.util.Scanner;

public class No0564_2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int height = sc.nextInt();
			int num = sc.nextInt();
			int cnt = 1;
			int[] h = new int[num];
			h[0] = height;

			for (int i = 1; i < num; i++) {
				h[i] = sc.nextInt();
			}
			Arrays.sort(h);

			for (int i = h.length - 1; i > 0; i--) {
				if (h[i] == height)
					break;
				cnt++;
			}

			// 一の位の判断
			if (cnt % 10 == 1) {
				System.out.println(cnt + "st");
			} else if (cnt % 10 == 2) {
				System.out.println(cnt + "nd");
			} else if (cnt % 10 == 3) {
				System.out.println(cnt + "rd");
			} else {
				System.out.println(cnt + "th");
			}
		}
	}
}
