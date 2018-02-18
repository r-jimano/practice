package jp.paiza.logic_summoner.challenges;

import java.util.*;

public class logics_equip_3002 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int hp = sc.nextInt();
		int a = sc.nextInt();// しきい値
		int b = sc.nextInt();// autocharge

		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			hp = hp + tmp;
			if (hp <= a && tmp < 0) {
				hp = hp + b;
			}
		}
		System.out.println(hp);
	}
}
