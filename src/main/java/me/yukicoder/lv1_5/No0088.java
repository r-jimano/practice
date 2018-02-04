package me.yukicoder.lv1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0088 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String sente = br.readLine();
			String gote = sente.equals("oda") ? "yukiko" : "oda";
			int teban = -4;

			for (int i = 0; i < 8; i++) {
				for (char c : br.readLine().toCharArray()) {
					teban = (c != '.') ? teban + 1 : teban;
				}
			}

			System.out.println(teban % 2 == 0 ? sente : gote);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static int teban(BufferedReader br) throws IOException {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 8; i++) {
			sb.append(br.readLine());
		}
		long teban = sb.chars().filter(r -> r != '.').count() - 4;
		return (int) teban;
	}
}
