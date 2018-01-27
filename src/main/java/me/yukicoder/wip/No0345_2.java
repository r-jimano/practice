package me.yukicoder.wip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * WIP
 */
public class No0345_2 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String str = br.readLine();
			int ans = -1;
			int idx = str.indexOf("c");

			while (idx != -1) {
				str = str.substring(idx + 1);
				int idxW1 = str.indexOf("w");
				int idxW2 = str.substring(idxW1 + 1).indexOf("w");
				int tmp = (idxW1 != -1 && idxW2 != -1) ? idxW1 + idxW2 + 3 : ans;
				ans = (tmp != -1) ? Math.min(ans, tmp) : ans;
				idx = str.indexOf("c");
			}
			System.out.println(ans);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}