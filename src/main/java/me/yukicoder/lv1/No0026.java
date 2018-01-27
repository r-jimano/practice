package me.yukicoder.lv1;

import java.util.Scanner;

/**
 * 太郎君と二郎君はゲームをしています。
 * <p>
 * テーブルの上にカップが3つあり、その中の1つだけに○印、
 * それ以外の2つには×印が外から見えないように記されています。
 * <br>
 * 太郎君から見て左にあるカップから1番、2番、3番として、
 * 最初に○印がどのカップについてるかが公開された後、
 * 二郎君は、何度かカップの位置をそれぞれ入れ替えるので、
 * 太郎君はどのカップに○印が付いているかを当てなければなりません。
 * <br>
 * 入れ替え中も入れ替えた後も、常に、左にあるカップから1番、2番、3番とし、
 * 最初以外は、カップについている印は見ることは出来ません。
 * <br>
 * 入力に、最初に○印が付いているカップの位置番号と、
 * 二郎君が入れ替えたカップの位置番号が与えられるので、
 * 最終的に○印が付いているカップの位置番号を出力してください。
 */
public class No0026 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int N = sc.nextInt();// 最初に○印が付いているカップ
			int M = sc.nextInt();
			int mark = N;

			for (int i = 0; i < M; i++) {
				int p = sc.nextInt();
				int q = sc.nextInt();

				if (mark == p) {
					mark = q;
				} else if (mark == q) {
					mark = p;
				}
			}

			System.out.println(mark);
		}
	}
}