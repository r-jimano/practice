package me.yukicoder.lv1;

import java.util.Scanner;

/**
 * A君は左から右に1から10までの数を書くことを試みました。
 * <br>
 * しかし、A君は書いた数が9個しかないことに気づきました。
 * どうやら書くべき数を1つ書かなかったようです。
 * <br>
 * A君が書かなかった数はいくつでしょうか？
 */

public class No0481 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int sum = 10 * (10 + 1) / 2;// 1から10までの合計
		int num = sc.nextInt();// 書いた数9個の合計

		while (sc.hasNext()) {
			num += sc.nextInt();
		}

		System.out.println(sum - num);
	}
}