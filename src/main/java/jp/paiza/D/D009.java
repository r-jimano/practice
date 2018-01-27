package jp.paiza.D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D009 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] readArray = br.readLine().trim().split(" ");

		int[] num = new int[readArray.length];

		for (int i = 0; i < readArray.length; i++) {
			num[i] = Integer.parseInt(readArray[i]);
		}
		System.out.println(num[1] - num[0]);
	}
}
