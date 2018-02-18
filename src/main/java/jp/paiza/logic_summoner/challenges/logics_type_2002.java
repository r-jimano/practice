package jp.paiza.logic_summoner.challenges;

import java.util.*;

public class logics_type_2002 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] square = new int[N][N];
		int[][] zero = new int[2][2];// 値が分からない箇所
		boolean boo = false;

		// getvalue
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[i].length; j++) {
				square[i][j] = sc.nextInt();
				if (square[i][j] == 0) {
					if (!boo) {
						zero[0][0] = i;
						zero[0][1] = j;
						boo = true;
					} else {
						zero[1][0] = i;
						zero[1][1] = j;
					}
				}
			}
		}
		fillBrank(square, zero);
		showArray(square);
	}

	static void fillBrank(int[][] square, int[][] zero) {
		int n = square.length;
		int num = (int) (n * (Math.pow(n, 2.0) + 1) / 2);// 魔方陣の縦or横or対角線の和

		if (zero[0][0] == zero[1][0]) {
			// Blank is in the same row. calc from column.
			for (int jj = 0; jj < 2; jj++) {
				int temp = 0;
				int i = zero[jj][0];
				int j = zero[jj][1];
				for (int k = 0; k < n; k++) {
					temp += square[k][j];
				}
				square[i][j] = num - temp;
			}
		} else {
			// calc from row
			for (int ii = 0; ii < 2; ii++) {
				int temp = 0;
				int i = zero[ii][0];
				int j = zero[ii][1];
				for (int k = 0; k < n; k++) {
					temp += square[i][k];
				}
				square[i][j] = num - temp;
			}
		}
	}

	static void showArray(int[][] square) {
		for (int[] arr : square) {
			StringBuilder sb = new StringBuilder();
			for (int n : arr) {
				sb.append(n + " ");
			}
			System.out.println(sb.toString().trim());
		}
	}
}
