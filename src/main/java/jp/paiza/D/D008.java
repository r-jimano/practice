package jp.paiza.D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D008 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine());

		System.out.println(i % 2 == 0 ? "even" : "odd");
	}
}
