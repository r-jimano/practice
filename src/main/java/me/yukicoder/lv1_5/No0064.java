package me.yukicoder.lv1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0064 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] str = br.readLine().split(" ");
			long f0 = Long.parseLong(str[0]);
			long f1 = Long.parseLong(str[1]);
			long n = Long.parseLong(str[2]);

			if (n % 3 == 0) {
				System.out.println(f0);
			} else if (n % 3 == 1) {
				System.out.println(f1);
			} else {
				System.out.println(f1 ^ f0);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}