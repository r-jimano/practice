package me.yukicoder.lv1_5;

import java.util.Scanner;

/**
 * A+BA+B を計算します。しかし、'+'が嫌いなので'+'を使ってはいけません。
 *  ソースコード上に'+'の文字があると不正解になります。
 */

public class No0353 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			System.out.println(A - (-B));
		}
	}
}