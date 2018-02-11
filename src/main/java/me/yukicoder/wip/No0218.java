package me.yukicoder.wip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0218 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(br.readLine());
		double b = Double.parseDouble(br.readLine());
		double c = Double.parseDouble(br.readLine());
		double d = Math.ceil(a / b) * 2 / 3;
		double e = Math.ceil(a / c);

		System.out.println(d >= e ? "YES" : "NO");
	}
}
