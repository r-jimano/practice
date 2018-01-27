package me.yukicoder.lv1_5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Thomasのやる気は、簡単に計算できる。
 * 締め切りまでの残りの日数をD日とし、残りの作業量をWWとすると その日のやる気はW/D^2となる。
 * そして、やる気の小数切り捨ての値が、その日の作業量になる。
 * Thomasは、最終日にどれだけ作業をしないといけなくなるかが気になっている。
 * <p>
 * 最初の日に与えられた作業量Wと締め切りまでの日数Dが与えられるので
 * あなたは、Thomasが最後の日にどれだけの作業量があるか計算してあげてください。
 * 
 */

public class No0051 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			long w = Integer.parseInt(br.readLine());
			int d = Integer.parseInt(br.readLine());
			int moto = 0;

			while (d > 0) {
				moto = (int)w / d / d;
				w -= moto;
				d--;
			}
			System.out.println(moto);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}