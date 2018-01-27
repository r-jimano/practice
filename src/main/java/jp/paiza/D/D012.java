package jp.paiza.D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D012 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine().trim());

		System.out.println(Math.abs(num));
	}
}
