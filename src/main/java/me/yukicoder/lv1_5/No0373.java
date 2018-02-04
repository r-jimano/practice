package me.yukicoder.lv1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0373 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] str = br.readLine().split(" ");
			long a = Long.parseLong(str[0]);
			long b = Long.parseLong(str[1]);
			long c = Long.parseLong(str[2]);
			long d = Long.parseLong(str[3]);
			long ans = ((a * b) % d) * c % d;// 桁があふれるので都度計算
			System.out.println(ans);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}