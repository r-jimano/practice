package jp.paiza.D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D004 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine().trim();
		String readLine = null;
		StringBuilder sb = new StringBuilder();
		int cnt = Integer.parseInt(line);

		for (int i = 0; i < cnt; i++) {
			readLine = br.readLine().trim();
			sb.append(readLine);

			if (i != cnt - 1) {
				sb.append(",");
			} else {
				sb.append(".");
			}
		}
		System.out.println(new String("Hello " + sb));
	}
}
