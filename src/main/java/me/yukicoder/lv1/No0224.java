package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 文字列変更(easy)
 */
public class No0224 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int n = Integer.parseInt(br.readLine());
			char[] s = br.readLine().toCharArray();
			char[] t = br.readLine().toCharArray();
			int cnt = 0;

			for (int i = 0; i < n; i++) {
				if (s[i] != t[i])
					cnt++;
			}
			System.out.println(cnt);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}