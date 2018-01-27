package me.yukicoder.lv1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class No0182 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			Map<Integer, Integer> map = new HashMap<>();

			for (int i = 0; i < N; i++) {
				int tmp = sc.nextInt();
				map.computeIfPresent(tmp, (k, v) -> (map.get(tmp) + 1));
				map.putIfAbsent(tmp, 1);
			}
			System.out.println(map.values().stream().filter(i -> i == 1).count());
		}
	}
}