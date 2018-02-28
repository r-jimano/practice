package jp.paiza.poh.hatsukoi.challenges;

import java.util.*;

public class hatsukoi_clothes6 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] act = new String[25];
		int temp = 0;// 温度
		int cost = 0;

		for (int i = 0; i < N; i++) {
			act[sc.nextInt()] = sc.next();
		}

		for (int i = 0; i < 24; i++) {
			if (act[i] != null) {
				temp = act[i].equals("out") ? temp + 3 : temp + 5;
			}
			if (temp == 0) {
				cost++;
			} else {
				cost = cost + 2;
				temp--;
			}
		}
		System.out.println(cost);
	}
}
