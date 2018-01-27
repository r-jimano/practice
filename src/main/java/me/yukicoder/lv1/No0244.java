package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * グラフとは頂点と辺からなるデータ構造のことである。
 * 頂点と頂点の間を辺で繋ぐことで頂点と頂点を結ぶことができる。
 * 頂点と頂点を辺で繋いだ頂点間を自由に移動できる。
 * いま頂点がNN個与えられる。最初の状態ですべての頂点は辺で繋がっていない。
 * 頂点と頂点を辺で繋ぐときのグラフのルールは次のようなものである。
 * ・辺は必ず異なる頂点間を繋ぐ。
 * ・同じ頂点と頂点の間に２本以上の辺は無い。
 * 最初からある頂点の数NNが与えられるので、すべての頂点を移動できるように繋ぐ必要のある最少の辺の本数を答えよ。
 *
 */
public class No0244 {
	public static void main(String[] args) {
		int num = 0;
		
		try (BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in))) {
			num = Integer.parseInt(br.readLine()) - 1;
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(num);
	}
}