package me.yukicoder.lv1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0175 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		
		System.out.println((int)Math.pow(2.0, l - 3) * n);
	}
}
