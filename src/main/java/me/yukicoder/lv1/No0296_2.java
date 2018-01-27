package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0296_2 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			String[] str = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int h = Integer.parseInt(str[1]);
			int m = Integer.parseInt(str[2]);
			int t = Integer.parseInt(str[3]);

			for (int i = 0; i < n - 1; i++) {
				m += t;
				if (m > 59) {
					m = m % 60;
					// 繰り上げ
					h += m / 60;					
					h = (h > 23) ? h - 24 : h;
				}
			}

			System.out.print(h + "\n" + m);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}