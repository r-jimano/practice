package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 「プログラミングコンテストチャレンジブック」通称「蟻本」という有名な本がある。
 * この本の第一版は316ページであり、第二版は368ページもある。
 * このことから蟻本のページ数は版が一つ上がるごとに52(=368-316)ページ増える等差数列であるという予想が立てられる。
 * <br>
 * 蟻本の第N版のページ数をこの予想に基づいて計算せよ。
 */
public class No0299 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			long N = Long.parseLong(br.readLine());

			System.out.println(316 + 52 * (N - 1));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}