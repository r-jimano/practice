package me;

import java.util.*;

/**
 * modulus10 wait 3-1 (MOD 10)
 */
public class CheckDigitSample {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int modulus = 10;

		StringBuilder sb = new StringBuilder(sc.next());
		String rev = sb.append(0).reverse().toString();
		char[] arr = rev.toCharArray();
		int oddTotal = 0;
		int evenTotal = 0;

		for (int i = 0; i < arr.length; i++) {
			if ((i + 1) % 2 == 0) {
				evenTotal += arr[i] - 48;
			} else {
				oddTotal += (int) arr[i] - 48;
			}
		}

		int digit = 10 - (oddTotal * 3 + evenTotal) % modulus;
		System.out.println(digit);
	}

}
