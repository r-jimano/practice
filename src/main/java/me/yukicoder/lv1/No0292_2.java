package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0292_2 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			String[] str = br.readLine().split(" ");
			int t = Integer.parseInt(str[1]);
			int u = Integer.parseInt(str[2]);
			char[] array = str[0].toCharArray();
			array[t] = ' ';
			array[u] = ' ';
			String name = String.valueOf(array).replaceAll(" ", "");

			System.out.println(name);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}