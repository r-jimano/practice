package com.codewars.kata._7kyu;

public class MiddleExample {
	public static String getMiddle(String word) {
		int cnt = word.length();
		boolean isEven = (cnt % 2 == 0);
		int half = cnt / 2;

		if (isEven) {
			return word.substring(half - 1, half + 1);
		} else {
			return word.substring(half, half + 1);
		}
	}
}
