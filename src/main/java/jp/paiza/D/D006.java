package jp.paiza.D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D006 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine().trim();
		String[] readLineArray = line.split(" ");

		int i = Integer.parseInt(readLineArray[0]);
		String str = readLineArray[1];

		switch (str) {
		case "km":
			System.out.println(i * 1000000);
			break;
		case "m":
			System.out.println(i * 1000);
			break;
		case "cm":
			System.out.println(i * 10);
			break;
		}
	}
}
