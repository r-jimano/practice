package me.yukicoder.wip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class No0089 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cal = Integer.parseInt(br.readLine());
		String[] r = br.readLine().split(" ");
		int[] round = {Integer.parseInt(r[0]), Integer.parseInt(r[1])};

		double calorie = calcVolume(round[0], round[1]) * cal;
		System.out.println(new BigDecimal(calorie).setScale(5, RoundingMode.HALF_EVEN));

	}

	/*
	 * 
	 */
	static double calcVolume(int roundIn, int roundOut) {
		double rad = (roundOut - roundIn) / 2.0;
		double Rad = roundOut - rad;
		return 2 * Math.pow(Math.PI, 2.0) * Math.pow(rad, 2.0) * Rad;
	}
}
