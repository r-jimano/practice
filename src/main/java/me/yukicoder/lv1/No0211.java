package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class No0211 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			int K = Integer.parseInt(br.readLine());
			int[] prime = { 2, 3, 5, 7, 11, 13 };
			int[] composite = { 4, 6, 8, 9, 10, 12 };
			int cnt = 0;
			BigDecimal ans;

			for (int p : prime) {
				for (int c : composite) {
					if (p * c == K)
						cnt++;
				}
			}
			ans = new BigDecimal((double) cnt / 36).setScale(12, RoundingMode.HALF_UP);

			System.out.println(ans);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}