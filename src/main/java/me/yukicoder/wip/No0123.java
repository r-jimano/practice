package me.yukicoder.wip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class No0123 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input1 = br.readLine().split(" ");
		int n = Integer.parseInt(input1[0]);
		int m = Integer.parseInt(input1[1]);
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			list.add(i + 1);
		}

		String[] input2 = br.readLine().split(" ");
		for (int i = 0; i < m; i++) {
			int idx = Integer.parseInt(input2[i]);
			int ret = list.remove(idx - 1);
			list.addFirst(ret);
		}

		System.out.println(list.get(0));
	}
}
