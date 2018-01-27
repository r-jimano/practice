package me.yukicoder.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class No0564 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int h = sc.nextInt();
			int num = sc.nextInt();
			int cnt = 1;
			List<Integer> l = new ArrayList<>();
			l.add(h);

			for (int i = 1; i < num; i++) {
				l.add(sc.nextInt());
			}
			Collections.sort(l);
			Collections.reverse(l);
			for (int i : l) {
				if (i == h)
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
