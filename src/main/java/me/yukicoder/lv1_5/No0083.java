package me.yukicoder.lv1_5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * N本のマッチ棒が与えられたとき、それらを並べて表記できる最大の数を求めよ。
 * 
 * printするだけでもいいの・・・？
 * 大きい数を作るには桁数を大きく
 * nが偶数なら１をひたすら並べる
 * 奇数なら１を n/2 - 1個、先頭にに7を一つ加える
 */

public class No0083 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int n = Integer.parseInt(br.readLine());
			int cnt = n / 2;// 最大でマッチ棒の本数/2だけループ
			StringBuilder sb = new StringBuilder();

			if (n % 2 != 0) {
				sb.append(7);
				cnt--;
			}
			for (int i = 0; i < cnt; i++) {
				sb.append(1);
			}

			System.out.println(sb);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}