package me.yukicoder.lv1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class No0236 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] str = br.readLine().split(" ");
			double a = Double.parseDouble(str[0]);
			double b = Double.parseDouble(str[1]);
			double x = Double.parseDouble(str[2]);
			double y = Double.parseDouble(str[3]);
			double amount = 0;

			// 他方をフルで使いたいときに欲しい量
			double maxY = x / a * b;
			double maxX = y / b * a;

			// 欲しい量を引き当てられるか
			amount = (x >= maxX) ? maxX + y : maxY + x;

			System.out.println(new BigDecimal(amount).setScale(7, RoundingMode.HALF_EVEN));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
