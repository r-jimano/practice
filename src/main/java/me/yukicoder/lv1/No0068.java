package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 同じ長さの文字列Aと文字列Bが与えられる。
 * 文字列Aの順番を自由に並び替えることができる。
 * 文字列Aと文字列Bを同じにできるか判定せよ。
 */

public class No0068 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			char[] a = br.readLine().toCharArray();
			char[] b = br.readLine().toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);

			if (Arrays.equals(a, b)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}