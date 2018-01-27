package me.yukicoder.lv1;
import java.util.Scanner;

/**
 * 諸外国では，○＋□＝8のように，答えがたくさんある問題があるようですが，採点が大変ですよね．
 * そこで，やっぱり和風に答えが一意定まるように条件を加える事としましょう．
 * <br>
 * おや，条件を加えすぎたかもしれません．
 * N 個の正整数の 2 つ組 (X1,Y1),(X2,Y2),…,(XN,YN) が与えられるので，
 * 　　□ +Xk=Yk, k=1,2,…,N を同時に満たす□に当てはまる正整数を求めてください．
 */
public class No0185 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int ans = 0;
			int tmp = 0;

			for (int i = 0; i < N; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				ans = y - x;

				if (i == 0) {
					tmp = ans;
				}
				if (ans < 1 || tmp != ans) {
					ans = -1;
					break;
				}
				tmp = ans;
			}
			System.out.println(ans);

		}
	}
}