package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0070 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int cnt = Integer.parseInt(br.readLine());
			int sum = 0;

			for (int i = 0; i < cnt; i++) {
				String[] input = br.readLine().split(" ");
				String[] str1 = input[0].split(":");
				String[] str2 = input[1].split(":");
				int[] bedtime = { Integer.parseInt(str1[0]), Integer.parseInt(str1[1]) };
				int[] wakeuptime = { Integer.parseInt(str2[0]), Integer.parseInt(str2[1]) };

				// 分換算しちゃう。要は単位を合わせたほうが計算しやすい。
				int bed = bedtime[0] * 60 + bedtime[1];
				int wake = wakeuptime[0] * 60 + wakeuptime[1];
				if (bed > wake) {
					wake += 24 * 60;
				}
				sum += wake - bed;
			}
			System.out.println(sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
