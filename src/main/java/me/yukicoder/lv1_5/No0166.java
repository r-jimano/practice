package me.yukicoder.lv1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0166 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" "); 
		long h = Long.parseLong(input[0]);
		long w = Long.parseLong(input[1]);
		long n = Long.parseLong(input[2]);
		long k = Long.parseLong(input[3]);
		
		long hw = h * w;
		System.out.println((hw % n == k || hw % n == 0 && n == k) ? "YES" : "NO");
	}
}
