package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * yukiさんは足し算が苦手でよく足し間違いをします。<br>
 * N個の数字とyukiさんの答えが与えられるので, 「本当の答え」−「yukiさんの答え」の値を出力して下さい
 */

public class No0369 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int N = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			int V = Integer.parseInt(br.readLine());
			int ans = 0;
			
			for (String s : str) {
				ans += Integer.parseInt(s);
			}
			System.out.println(ans - V);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}