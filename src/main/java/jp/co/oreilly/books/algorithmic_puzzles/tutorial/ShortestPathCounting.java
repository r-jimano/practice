package jp.co.oreilly.books.algorithmic_puzzles.tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ある都市の交差点A（0,0）からB(i,j)への最短経路の数を数えよ。この都市の道は碁盤の目状になっているとする。
 */
public class ShortestPathCounting {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] str = br.readLine().split(" ");
			int i = Integer.parseInt(str[0]);
			int j = Integer.parseInt(str[1]);
			ShortestPathCounting s = new ShortestPathCounting();
			s.solveConbination(i, j);
			s.solveDynamic(i, j);// 通りの数から求める
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 最短経路の数を返します。
	 */
	int solveConbination(int i, int j) {
		// 経路の数から求めるので、仮引数から-1して組み合わせを計算
		return _calcFactorial(i - 1 + j - 1) / (_calcFactorial(i - 1) * _calcFactorial(j - 1));
	}

	private int _calcFactorial(int num) {
		return (num == 1) ? 1 : num * _calcFactorial(num - 1);
	}
	
	/**
	 * 最短経路の数を返します。
	 * @param line 水平方向の通り
	 * @param col 垂直方向の通り
	 * @return 
	 */
	protected int solveDynamic(int line, int col) {
		int[][] grid = new int[line][col];

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < col; j++) {
				if (i == 0 || j == 0) {
					grid[i][j] = 1;
				} else {
					grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
				}
			}
		}
		return grid[line - 1][col - 1];
	}
}
