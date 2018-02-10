package me.yukicoder.lv1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0436 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		int cntC = 0;
		int cntW = 0;

		for (char c : input) {
			if (c == 'c') {
				cntC++;
			} else {
				cntW++;
			}
		}

		System.out.println(Math.min(cntC - 1, cntW));
	}
}
