package jp.paiza.poh.moshijo.challenges;

import java.util.*;

public class moshijo_character_7 {
	@SuppressWarnings("resource")
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] unit = new int[n];
		int[] cnt = new int[n];
		int[] disconut = new int[n];

		for (int i = 0; i < n; i++) {
			unit[i] = sc.nextInt();
			cnt[i] = sc.nextInt();
			disconut[i] = sc.nextInt();
		}

		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();// 商品の購入数

			System.out.println(unit[s - 1] * c - disconut[s - 1] * (c / cnt[s - 1]));
		}
	}
}
