package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * kamipeipaa君は木が大好きですが，今日は文字列で遊んでいます。
 * kamipeipaa君は文字列Sを並び替えたときに"tree"という部分文字列を
 * いくつ作ることが可能か興味があります。教えてあげてください。
 * t r e/2 の最小値ぶんだけ文字列を生成可能
 */

public class No0279 {
	public static void main(String[] args) {
		try (BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in))) {
			char[] arr = br.readLine().toCharArray();
			int t_cnt = 0;
			int r_cnt = 0;
			int e_cnt = 0;

			for (char c : arr) {
				if (c == 't') {
					t_cnt++;
				} else if (c == 'r') {
					r_cnt++;
				} else if (c == 'e') {
					e_cnt++;
				}
			}
			int tr_cnt = Math.min(t_cnt, r_cnt);
			System.out.println(Math.min(tr_cnt, e_cnt / 2));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}