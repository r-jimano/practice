package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;

public class No0394 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] str = br.readLine().split(" ");
			double[] score = new double[str.length];

			for (int i = 0; i < str.length; i++) {
				score[i] = Double.parseDouble(str[i]);
			}
			Arrays.sort(score);
			double avg = Arrays.stream(score).skip(1).limit(str.length - 2).sum() / (str.length - 2);

			System.out.println(new BigDecimal(avg).setScale(2));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}