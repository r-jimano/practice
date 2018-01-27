package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0547 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int length = Integer.parseInt(br.readLine());
			int cnt = 0;
			String[] str1 = br.readLine().split(" ");
			String[] str2 = br.readLine().split(" ");

			for (int i = 0; i < length; i++) {
				if (!str1[i].equals(str2[i])) {
					cnt = i;
					break;
				}
			}
			System.out.println((cnt + 1) + "\n" + str1[cnt] + "\n" + str2[cnt]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
