package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ハルカちゃんとユウちゃんはとっても仲良しなので、２人でポッキーゲームをすることにしました。
 * 長さが L(mm)のポッキーを２人はそれぞれ両端から中央に向かって齧っていきます。
 * ２人とも毎回 K(mm)ずつ同じタイミングでポッキーを齧ります。
 * ユウちゃんは恥ずかしがり屋さんなので、
 * 次のタイミングで２人ともポッキーを齧ろうとしたら唇が触れてしまうと分かった時点で齧り進めるのを止めて、
 * 残りは全部ハルカちゃんが食べてしまいます。
 * 
 * このとき、ユウちゃんが食べるポッキーの長さは何mmか？
 * 
 * 入力 L,K はそれぞれ整数値で与えられる。
 * 1≤L≤10^9 はゲームに用いるポッキーの長さを表す。
 * 1≤K≤50はお互いが1回に齧るポッキーの長さを表す。
 * 残りのポッキーの長さが0(もしくはそれ以下)で唇が触れるものとする。
 */

public class No0063 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] str = br.readLine().split(" ");
			int L = Integer.parseInt(str[0]);
			int K = Integer.parseInt(str[1]);
			int cnt;

			for (cnt = 0; (K * 2) < L; cnt++) {
				L -= K * 2;
			}
			System.out.println(K * cnt);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}