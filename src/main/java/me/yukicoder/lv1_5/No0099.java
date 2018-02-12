package me.yukicoder.lv1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0099 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int odd = 0;
		int even = 0;

		for (int i = 0; i < num; i++) {
			if (Integer.parseInt(input[i]) % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}

		System.out.println(Math.abs(even - odd));
	}
}
