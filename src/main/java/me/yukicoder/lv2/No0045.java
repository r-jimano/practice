package me.yukicoder.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0045 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int cntDish = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			int[] v = new int[cntDish];
			int[] max = new int[cntDish];

			for (int i = 0; i < cntDish; i++) {
				v[i] = Integer.parseInt(str[i]);
			}

			max[0] = v[0];
			if (max.length > 1) {
				max[1] = Math.max(v[0], v[1]);
				for (int i = 2; i < cntDish; i++) {
					// i個までの最大値を都度調べる
					max[i] = Math.max(max[i - 1], max[i - 2] + v[i]);
				}
			}
			System.out.println(max[cntDish - 1]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}