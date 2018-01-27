package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No0079 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] str = br.readLine().split(" ");
			int W = Integer.parseInt(str[0]);
			int H = Integer.parseInt(str[1]);
			char ichimatsu1 = str[2].charAt(0);
			char ichimatsu2 = (ichimatsu1 == 'W') ? 'B' : 'W';
			StringBuilder sb =new StringBuilder();

			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1) {
						sb.append(ichimatsu1);
					} else {
						sb.append(ichimatsu2);
					}
				}
				sb.append("\n");
			}
			System.out.println(sb.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}