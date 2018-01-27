package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0637 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			final String f = "Fizz";
			final String b = "Buzz";
			final String fb = f + b;
			int sum = 0;
			String[] input = br.readLine().split(" ");

			for (int i = 0; i < input.length; i++) {
				int num = Integer.parseInt(input[i]);
				if (num % 15 == 0) {
					sum += fb.length();
				} else if (num % 3 == 0) {
					sum += f.length();
				} else if (num % 5 == 0) {
					sum += b.length();
				} else {
					sum += input[i].length();
				}
			}
			System.out.println(sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
