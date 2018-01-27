package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class No0239 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int N = Integer.parseInt(br.readLine());
			int[] greet = new int[N];
			int ans = -1;
			int cnt = 0;

			for (int i = 0; i < N; i++) {
				String[] str = br.readLine().split(" ");
				for (int j = 0; j < N; j++) {
					if (str[j].equals("nyanpass")) {
						greet[j]++;
					}
				}
			}

			for (int i = 0; i < greet.length; i++) {
				if (greet[i] == N - 1) {
					ans = i + 1;
					cnt++;
				}
			}
			System.out.println(cnt == 1 ? ans : -1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}