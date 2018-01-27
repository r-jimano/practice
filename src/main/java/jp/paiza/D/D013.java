package jp.paiza.D;

import java.util.Scanner;

public class D013 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] readArray = line.trim().split(" ");
		int[] num = new int[readArray.length];

		for (int i = 0; i < readArray.length; i++) {
			num[i] = Integer.parseInt(readArray[i]);
		}
		System.out.print(num[0] / num[1]);
		System.out.print(num[0] % num[1]);
	}
}
