package me.yukicoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No9001_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		String s = br.readLine();
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		System.out.println((a + b) + " " + s);
	}
}
