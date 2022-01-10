package jp.co.impress.book.algorithm3201;

import java.util.ArrayList;
import java.util.List;

public class NumericalCalcExample {

	List<Integer> calcPrimeNumber(int arr) {
		// TODO エラトステネスの篩、もっと高速化できるらしい。
		boolean[] isComposite = new boolean[arr + 1];
		int sqrt = (int) Math.sqrt((double) arr);
		int k = 2;

		// その数の平方根より
		while (k <= sqrt) {
			// 小さい素数の倍数を消せば
			for (int i = k; i <= arr / k; i++) {
				isComposite[k * i] = true;
			}
			do {
				k++;
			} while (isComposite[k]);
		}

		List<Integer> primeL = new ArrayList<>();
		for (int i = 2; i < isComposite.length; i++) {
			if (!isComposite[i]) {
				primeL.add(i);
			}
		}
		// 残った数が素数である。
		return primeL;
	}

	int calcGreatestCommonDivisor(int a, int b) {
		// ユークリッドの互除法で割りきれる数を探す。
		// a と b との最大公約数は b と r との最大公約数に等しい
		int r = a % b;
		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		return b;
	}
}
