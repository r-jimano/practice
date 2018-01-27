package me.yukicoder.lv1;
import java.util.Scanner;

/**
 * 高橋くんは高速なプログラミングにはタイピング力が不可欠と考えています。
 * そこで、タイピングゲームでタイピング力を鍛えます。
 * この問題では簡単のために、タイピングする文字列はアルファベット小文字のみからなる文字列を考えます。
 * 
 * あるタイピングゲームでは、1 ゲームは N 個の区間に分かれており、区間 k では、Tk ミリ秒以内に Sk という文字列をタイピングしなければいけません。
 * 高橋くんは 1 秒あたり 12 文字まで正しくタイプすることができます。
 * これは、1000 ミリ秒では 12 文字まで、999 ミリ秒では 11 文字までタイプできるということで、m ミリ秒では ⌊12m/1000⌋ 文字までタイプできることになります。
 * （⌊x⌋は xx を超えない最大の整数を表します）
 * 高橋くんはできるだけ多くの文字をタイプするとして、1 ゲーム全体で、
 * 高橋くんが正しくタイプできる文字数、および、タイプできずに逃してしまう文字数を求めるプログラムを書いてください。
 *
 */
public class No0035 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int sumTyped = 0;
			int sumAll = 0;

			for (int i = 0; i < N; i++) {
				int T = sc.nextInt();
				int S = sc.next().length();

				sumTyped += Math.min((12 * T / 1000), S);
				sumAll += S;
			}

			System.out.println(sumTyped + " " + (sumAll - sumTyped));
		}
	}
}