package me.yukicoder.lv1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class No0441 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		BigInteger a = new BigInteger(str[0]);
		BigInteger b = new BigInteger(str[1]);

		int res = a.add(b).compareTo(a.multiply(b));
		if (res == 1) {
			System.out.println("S");
		} else if (res == 0) {
			System.out.println("E");
		} else {
			System.out.println("P");
		}
	}
}
