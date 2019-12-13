package me.yukicoder.lv1;

import java.util.Scanner;

/**
 * 太郎君はロボットを遠隔で操縦している。
 * <p>
 * このロボットは現在(0,0)の座標に立っていて北の方向を向いている。
 * 太郎君はいまこのロボットを(X,Y)の座標に移動させたいと思っている。
 * <br>
 * ロボットに出来る命令は、1回につき以下のうちいずれかの命令を選んで指示することができる<br>
 * ・時計回りに、90∘その場で向き(進行方向)を変える。<br>
 * ・反時計回りに、90∘ その場で向き(進行方向)を変える。<br>
 * ・向いている方向に K距離だけ前進する。Kは、(1≤K≤L)の範囲で、命令のたびに指定することができる。
 */

public class No0048 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int L = sc.nextInt();

		System.out.println(turnCount(X, Y) + aheadCount(X, L) + aheadCount(Y, L));
	}

	static int turnCount(int x, int y) {
		if (y >= 0) {
			if (x == 0) {
				return 0;
			}
			return 1;
		} else {
			return 2;
		}
	}

	static int aheadCount(int x, int l) {
		int cnt = (Math.abs(x) / l);
		if (x % l != 0) {
			cnt++;
		}
		return cnt;
	}
}