package me.yukicoder.lv1;

import java.util.Scanner;

/**
 * 巷ではゴールデンウィークらしいです。なのでゴールデンウィークっぽい問題です。
 * 2週間分の平日(x)と休日(o)が分かるカレンダーが与えられます。
 * この2週間の期間以外は、平日とします。
 * 最大の連休（連続の休日）数を求めてください。
 */
public class No0203 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int cntHolidays = 0;
			int tmp = 0;
			String s = sc.nextLine() + sc.nextLine();
			char[] c = s.toCharArray();

			for (int i = 0; i < 14; i++) {
				if (c[i] == 'o') {
					tmp++;
				}
				if (c[i] == 'x') {
					cntHolidays = Math.max(cntHolidays, tmp);
					tmp = 0;
				}
			}
			cntHolidays = Math.max(cntHolidays, tmp);
			System.out.println(cntHolidays);
		}
	}
}