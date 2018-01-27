package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class No0597 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int N = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < N; i++) {
				sb.append(br.readLine());
			}
			System.out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
