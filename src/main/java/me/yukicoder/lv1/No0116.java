package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No0116 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int N = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			int[] matsu = new int[N];
			int cnt = 0;

			for (int i = 0; i < N; i++) {
				matsu[i] = Integer.parseInt(str[i]);
			}

			for (int i = 0; i < N - 2; i++) {
				int[] tmp = { matsu[i], matsu[i + 1], matsu[i + 2] };
				// 門松列？
				cnt = isKadomatsu(tmp) ? cnt + 1 : cnt;
			}
			System.out.println(cnt);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static boolean isKadomatsu(int[] matsu) {
		int[] tmp = { matsu[0], matsu[1], matsu[2] };
		Arrays.sort(tmp);
		return (tmp[1] != matsu[1]) && 
				(matsu[0] != matsu[1] && matsu[1] != matsu[2] && matsu[0] != matsu[2]);
	}
}