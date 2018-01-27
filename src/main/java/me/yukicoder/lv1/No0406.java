package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No0406 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int cnt = Integer.parseInt(br.readLine());
			int[] kamo = new int[cnt];
			String[] str = br.readLine().split(" ");

			for (int i = 0; i < cnt; i++) {
				kamo[i] = Integer.parseInt(str[i]);
			}
			Arrays.sort(kamo);

			int diff = kamo[1] - kamo[0];
			for (int i = 1; i < cnt - 1; i++) {
				int tmp = kamo[i + 1] - kamo[i];
				if (diff == 0 || tmp != diff) {
					System.out.println("NO");
					return;
				}
				diff = tmp;
			}
			System.out.println("YES");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
