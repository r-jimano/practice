package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0292 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			String[] str = br.readLine().split(" ");
			int t = Integer.parseInt(str[1]);
			int u = Integer.parseInt(str[2]);
			char[] array = str[0].toCharArray();

			for (int i = 0; i < array.length; i++) {
				if (i != t && i != u) {
					System.out.print(array[i]);
				}
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}