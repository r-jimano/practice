package jp.co.oreilly.books.algorithmic_puzzles.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ある都市の交差点A（0,0）からB(i,j)への最短経路の数を数えよ。この都市の道は碁盤の目状になっているとする。
 * <br>
 * ただし、通行止めの区域は通ってはならない。
 */
public class B13_BlockedPaths extends jp.co.oreilly.books.algorithmic_puzzles.tutorial.ShortestPathCounting{
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] str = br.readLine().split(" ");
			int i = Integer.parseInt(str[0]);
			int j = Integer.parseInt(str[1]);

			str = br.readLine().split(" ");
			int[] closed = { Integer.parseInt(str[0]), Integer.parseInt(str[1]) };// 通行止めで通れない交差点

			System.out.println(new B13_BlockedPaths().solveDynamic(i, j, closed));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 最短経路の数を返します。
	 * @param line 水平方向の通り
	 * @param col 垂直方向の通り
	 * @param closed 通行止めの交差点の座標
	 * @return 
	 */
	int solveDynamic(int line, int col, int[] closed) {
		int[][] grid = new int[line][col];

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < col; j++) {
				if (i == 0 || j == 0) {
					grid[i][j] = 1;
				} else if (i == closed[0] && j == closed[1]) {
					grid[i][j] = 0;
				} else {
					grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
				}
			}
		}
		return grid[line - 1][col - 1];
	}

	/**
	 * 最短経路の数を返します(通行止めの区域がない場合)
	 */
	@Override
	protected int solveDynamic(int line, int col) {
		int[] a = { -1, -1 };
		return solveDynamic(line, col, a);
	}
}
