package jp.paiza.logic_summoner.challenges;

import java.util.*;
 
public class logics_kind_1002 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String[] input = sc.next().split("");
		Deque<Integer> dq = new ArrayDeque<>();

		for (int i = 0; i < cnt; i++) {
			if (input[i].equals("L")) {
				dq.addFirst(i + 1);
			} else {
				dq.addLast(i + 1);
			}
		}
		System.out.println(dq.toString().replace(",", "").replace("[", "").replace("]", ""));
	}
}