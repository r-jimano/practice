package me.yukicoder.lv1_5;

import java.util.Scanner;

/**
 * Saraは、「ふしぎなポケット」を手に入れた。
 * 「ふしぎなポケット」は、いくつかビスケットを入れて叩くと、入れたビスケットの数が２倍になる。
 * <br>
 * Saraは最初1枚のビスケットを持っていて、「ふしぎなポケット」を使ってちょうどN枚のビスケットにして、全部食べたいと思っている。
 * （食べきれないので枚数をオーバーしてはいけない）
 * <br>
 * この時、ちょうどN枚にするには、Saraは最低何回ポケットを叩く必要があるか求めてください。
 */

public class No0047 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 1;
		int result = 0;

		while (cnt < N) {
			cnt = cnt * 2;
			result++;
		}

		System.out.println(result);
	}
}