package me.yukicoder.lv1_5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 整数 N が与えられます。N−100 以上 N+100 以下の合成数を 1 個見つけてください。
 * ここで、合成数とは 1 と自分自身以外の正の約数を持つ正整数のことをいいます。
 */
public class No0192 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		//偶数でさえあればよいので、じつはまともに探さなくても問題ない
		System.out.println( N % 2 == 0 ? N : N - 1);
	}
}