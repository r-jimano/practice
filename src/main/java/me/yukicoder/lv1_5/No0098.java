package me.yukicoder.lv1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class No0098 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] str = br.readLine().split(" ");
			double a = Double.parseDouble(str[0]);
			double b = Double.parseDouble(str[1]);
			double x = Double.parseDouble(str[2]);
			double y = Double.parseDouble(str[3]);
			double amount = 0;

			double ratioA = a / (a + b);// レシピの比
			double ratioX = x / (x + y);// 手持ちの比

			// 少ない方の量に合わせて作る
			if (ratioA > ratioX) {
				amount = x / a * b + x;
			} else if (ratioA < ratioX) {
				amount = y / b * a + y;
			} else {
				amount = (x >= y) ? 2 * y : 2 * x;
			}

			System.out.println(new BigDecimal(amount).setScale(7, RoundingMode.HALF_EVEN));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
