package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0082 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			// int N = 
			Integer.parseInt(br.readLine());
			String[] L = br.readLine().split(" ");
			int[] level = new int[6];

			for (String s : L) {
				level[Integer.parseInt(s) - 1]++;
			}

			int max = 0;
			int maxCnt = 0;
			for (int i = 0; i < level.length; i++) {
				if (max <= level[i]) {
					max = level[i];
					maxCnt = i + 1;
				}
			}
			System.out.println(maxCnt);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}