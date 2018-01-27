package me.yukicoder.lv1_5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1〜Nまでの数字について、<br>
 * 3の倍数かつ5の倍数：FizzBuzz<br>
 * 3の倍数：Fizz<br>
 * 5の倍数：Buzz<br>
 * それ以外：その数字自体<br>
 * と変換して、書き並べます。これをFizzBuzzString(N)とします。（1<=N<=10^18）
 * <p>
 *  では、FizzBuzzString(N)に含まれる'z'の個数を求めて下さい。
 */

public class No0311 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			long n = Long.parseLong(br.readLine());

			// FizzBuzzの数だけ数えてから個数を計算
			long FizzBuzz = (n / 15);
			long Fizz = (n / 3) - FizzBuzz;
			long Buzz = (n / 5) - FizzBuzz;
			long cnt = FizzBuzz * 4 + Fizz * 2 + Buzz * 2;
			System.out.println(cnt);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}