package jp.paiza.hatsukoi;

import java.util.*;

public class hatsukoi_hair6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cap = sc.nextInt() * 60;
		int cnt = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i < cnt; i++) {
			sum += sc.nextInt();
			if (sum >= cap) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("OK");
	}

}
