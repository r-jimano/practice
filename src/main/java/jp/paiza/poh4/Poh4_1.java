package jp.paiza.poh4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Poh4_1 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int stock, sum = 0;

		// 商品の各在庫数を合計
		for (int i = 0; i < cnt; i++) {
			stock = Integer.parseInt(br.readLine());
			sum += stock;
		}
		System.out.println(sum);
	}
}
