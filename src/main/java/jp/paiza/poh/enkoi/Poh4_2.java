package jp.paiza.poh.enkoi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Poh4_2 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());

		int required, stock, price, sum = 0;
		String[] readLineArray = new String[3];

		for (int i = 0; i < cnt; i++) {
			readLineArray = br.readLine().trim().split(" ");

			required = Integer.parseInt(readLineArray[0]);
			stock = Integer.parseInt(readLineArray[1]);
			price = Integer.parseInt(readLineArray[2]);

			// 足りなければ、補充に最低限必要な金額を計算
			if (required > stock) {
				sum += (required - stock) * price;
			}
		}
		System.out.println(sum);
	}
}
