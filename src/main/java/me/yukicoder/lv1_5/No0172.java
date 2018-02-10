package me.yukicoder.lv1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0172 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
		int r = Integer.parseInt(str[2]);
		// 接点とｒと接線上の点で二等辺三角形を作ってみると
		System.out.println((int)(Math.abs(x) + Math.abs(y) + r * Math.sqrt(2.0)) + 1);
	}
}
