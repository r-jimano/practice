package me.yukicoder.lv1;

import java.util.Scanner;

/**
 * 3つの死亡フラグの状態と、1つの生存フラグの状態が与えられるので、
 * 死亡か生存か判定してください。判定方法は次の通りです。
 * <br>
 * 死亡フラグが2本以上立っていれば死亡、2本未満なら生存
 * 生存フラグが立っていれば、死亡フラグの状態に関わらず生存
 */

public class No0431 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int d1 = sc.nextInt();
			int d2 = sc.nextInt();
			int d3 = sc.nextInt();
			int d = d1 + d2 + d3;
			int S = sc.nextInt();

			if (S == 1 || d < 2) {
				System.out.println("SURVIVED");
			}
			else {
				System.out.println("DEAD");
			}
		}
	}
}