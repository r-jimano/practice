package jp.paiza.D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D005 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine().trim();
		String[] s = line.split(" ");

		int m = Integer.parseInt(s[0]);// 初項
		int n = Integer.parseInt(s[1]);// 公差
		int cnt = 10;

		for (int i = 0; i < cnt; i++) {
			System.out.print(m + n * i);
			if ((i + 1) != cnt) {
				System.out.print(" ");
			} else {
				System.out.println();
			}
		}
	}

}
