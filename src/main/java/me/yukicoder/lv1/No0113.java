package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class No0113 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			char[] array = br.readLine().toCharArray();
			double[] point = new double[2];

			for (char c : array) {
				if (c == 'N') {
					point[0] += 1.0;
				} else if (c == 'E') {
					point[1] += 1.0;
				} else if (c == 'W') {
					point[1] -= 1.0;
				} else if (c == 'S') {
					point[0] -= 1.0;
				}
			}
			double d = Math.pow(Math.abs(point[0]), 2) + Math.pow(Math.abs(point[1]), 2);
			double dist = Math.sqrt(d);
			BigDecimal ans = new BigDecimal(dist).setScale(5, RoundingMode.HALF_DOWN);
			System.out.println(ans);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}