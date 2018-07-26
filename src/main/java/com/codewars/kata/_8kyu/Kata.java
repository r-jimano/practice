package com.codewars.kata._8kyu;

public class Kata {
	public static int[] countPositivesSumNegatives(int[] input) {
		if (input == null || input.length == 0) {
			return new int[0];
		}

		int cnt = 0;
		int sum = 0;

		for (int i : input) {
			if (i > 0) {
				cnt++;
			} else if (i < 0) {
				sum += i;
			}
		}
		return new int[] { cnt, sum };
	}

	public static int[] digitize(long n) {
		char[] array = String.valueOf(n).toCharArray();
		int[] ret = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			ret[i] = Character.getNumericValue(array[array.length - i - 1]);
			
			// charと数字だけ扱うならこっちのほうが良い？あとは、CharSequence#chars()を使ってストリーム処理する
//			ret[i] = (int) (array[array.length - i - 1]) - 48;
		}
		return ret;
	}
}