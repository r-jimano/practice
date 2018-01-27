package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0405 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] input = br.readLine().split(" ");
			String[] roman = { "I", "II", "III", "IIII", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII" };

			// いま何時？(romanのindexで考える)
			int hour = 1;
			for (int i = 0; i < roman.length; i++) {
				if (input[0].equals(roman[i])) {
					hour = i;
					break;
				}
			}

			// 単針はどれくらい動かすか？現在時刻＋T時を12で割ったあまりだけ進むor戻る
			int ans = (hour + Integer.parseInt(input[1])) % 12;
			ans = (ans >= 0 ? ans : ans + 12);
			System.out.println(roman[ans]);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}