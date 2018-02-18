package jp.paiza.logic_summoner.challenges;

import java.util.*;

public class logics_type_2001 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.nextLine().toCharArray();
		int cnt = 0;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				if (arr[i] != 'b') {
					sb.append(0 + " ");
				}
				cnt++;
			} else {
				if (arr[i] == arr[i - 1]) {
					cnt++;
				} else {
					sb.append(cnt + " ");
					cnt = 1;
				}
			}
		}
		sb.append(cnt + " ");

		System.out.println(sb.toString().trim());
	}
}
