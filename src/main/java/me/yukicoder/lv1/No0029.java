package me.yukicoder.lv1;
import java.util.Scanner;

/**
 * Quinは、RPGをしている。
 * <br>
 * そのRPGでは、アイテムは10種類（それぞれ番号付けされている）あり、「同じアイテム」を2つ揃えるか、「任意のアイテム」を4つ揃えるとパワーアップする仕組みがある。
 * そして敵を倒したら、何かアイテムを３つもらうことができる。（同じアイテムがもらえることもある。）
 * このとき、持てるアイテムの上限はないとし、アイテムの組み合わせは自由に決められる。（自動的にパワーアップすることはないとする。）
 * <br>
 * N回敵を倒すと考えたとき、その時のパワーアップする最大の回数を求めてください。
 */
public class No0029 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] items = new int[10];

		// アイテムを格納
		for (int i = 0; i < N * 3; i++) {
			int itemNum = sc.nextInt();
			items[itemNum - 1] = items[itemNum - 1] + 1;
		}

		int upCnt = 0;
		int modCnt = 0;
		for (int i : items) {
			upCnt += i / 2;
			modCnt += i % 2;
		}
		upCnt += modCnt / 4;
		System.out.println(upCnt);
	}	
}