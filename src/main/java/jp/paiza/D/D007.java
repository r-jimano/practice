package jp.paiza.D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D007 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine());

		for (int j = 0; j < i; j++) {
			System.out.print("*");
		}
	}
}
