package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0104 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			char[] array = br.readLine().toCharArray();
			int route = 1;

			for (char c : array) {
				if (c == 'L') {
					route *= 2;
				} else if (c == 'R') {
					route = (route * 2) + 1;
				}
			}
			System.out.println(route);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}