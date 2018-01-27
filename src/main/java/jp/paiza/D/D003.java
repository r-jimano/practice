package jp.paiza.D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D003 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine().trim();
		int num = Integer.parseInt(line);

		for (int i = 0; i < 9; i++) {
			System.out.print(num * (i + 1));
			if ((i + 1) != 9) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
