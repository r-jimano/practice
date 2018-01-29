package me.yukicoder.lv1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0098 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			double dist = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));// 原点からの距離
			
			System.out.println((int)(dist * 2 + 1));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
