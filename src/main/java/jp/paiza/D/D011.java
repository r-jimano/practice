package jp.paiza.D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D011 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] line = br.readLine().trim().toCharArray();

		System.out.println(line[0] - 'A' + 1);
	}
}
