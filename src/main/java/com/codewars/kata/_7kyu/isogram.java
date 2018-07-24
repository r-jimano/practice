package com.codewars.kata._7kyu;

public class isogram {
	public static boolean isIsogram(String str) {
		String input = str.toLowerCase();
		char[] arr = input.toCharArray();

		for (char c : arr) {
			int idx = input.indexOf(c);
			if (input.indexOf(c, idx + 1) != -1) {
				return false;
			}
		}
		return true;
		
		// streamならもっとスッキリ
//		return input.length() == input.chars().distinct().count();
	}
}
