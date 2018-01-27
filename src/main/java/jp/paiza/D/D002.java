package jp.paiza.D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D002 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine().trim();
		String[] readArrayLine = line.split(" ");

		int length = readArrayLine.length;
		int[] num = new int[length];

		for (int i = 0; i < length; i++) {
			num[i] = Integer.parseInt(readArrayLine[i]);
		}

		if (num[0] > num[1]) {
			System.out.println(num[0]);
		} else if (num[1] > num[0]) {
			System.out.println(num[1]);
		} else {
			System.out.println("eq");
		}

	}
}
