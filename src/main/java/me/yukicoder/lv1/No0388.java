package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ステア君は階段を上るのが大好きです。今日も近所にあるお寺のお気に入りの階段を上っています。
 * S 段目に上がったとき、ふとステア君は自分の家でいうと何階に相当する高さに居るのかが気になりました。
 * <p>
 * ステア君の家の一階層分に相当する段数 Fが与えられるので、ステア君が今何階にいるのか計算して下さい。
 */

public class No0388 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] str = br.readLine().split(" ");
			int d = Integer.parseInt(str[0]);
			int p = Integer.parseInt(str[1]);
			System.out.println(d / p + 1);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}