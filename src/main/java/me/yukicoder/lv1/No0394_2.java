package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;

public class No0394_2 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] str = br.readLine().split(" ");
			int[] score = new int[str.length];
			double sum = 0;

			for (int i = 0; i < str.length; i++) {
				score[i] = Integer.parseInt(str[i]);
			}
			Arrays.sort(score);

			for (int i = 1; i < str.length - 1; i++) {
				sum += score[i];
			}
			double avg = sum / (str.length - 2);

			System.out.println(new BigDecimal(avg).setScale(2));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}