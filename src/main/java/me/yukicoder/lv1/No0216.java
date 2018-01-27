package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0216 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int cnt = Integer.parseInt(br.readLine());
			String[] a = br.readLine().split(" ");
			String[] b = br.readLine().split(" ");
			int[] score = new int[100];
			int scoreK = 0;
			int max = 0;

			for (int i = 0; i < cnt; i++) {
				int tmp = Integer.parseInt(a[i]);
				int cntSolved = Integer.parseInt(b[i]);
				if (cntSolved == 0) {
					scoreK += tmp;
				} else {
					score[cntSolved - 1] += tmp;
				}
			}
			for (int i = 0; i < 100; i++) {
				max = Math.max(max, score[i]);
			}
			System.out.println(max <= scoreK ? "YES" : "NO");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}