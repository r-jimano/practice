package me.yukicoder.lv1;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 数字が書かれているブロックはそれぞれ高さ1で幅はWi である。
 * それらのブロックを高さ1,幅Lの大きな箱の中に入れる。
 * <br>
 * 大きな箱に最大何個のブロックが入るかを求めてください。
 */
public class No0005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int cntBlk = sc.nextInt();

		int[] widthOfBlk = new int[cntBlk];
		for (int i = 0; i < widthOfBlk.length; i++) {
			widthOfBlk[i] = sc.nextInt();
		}
		System.out.println(cnt(widthOfBlk, length));
	}

	static int cnt(int[] w, int l) {
		int cnt = 0;
		Arrays.sort(w);
		for (int w1 : w) {
			int tmp = l - w1;
			if (tmp >= 0) {
				l = tmp;
				cnt++;
			}
		}
		return cnt;
	}
}