package jp.paiza.D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D001 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine().trim();
		String[] readLineArray = line.split(" ");

		if (readLineArray[0].equals(readLineArray[1])) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
