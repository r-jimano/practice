package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 化石のバージョン
 */
public class No0138 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] s1 = br.readLine().split("\\.");
			String[] s2 = br.readLine().split("\\.");
			int[] version1 = new int[3];
			int[] version2 = new int[3];

			for (int i = 0; i < s1.length; i++) {
				version1[i] = Integer.parseInt(s1[i]);
				version2[i] = Integer.parseInt(s2[i]);
			}

			for (int j = 0; j < 3; j++) {
				if (version1[j] > version2[j]) {
					System.out.println("YES");
					break;
				} else if (version1[j] < version2[j]) {
					System.out.println("NO");
					break;
				} else if (j == 2 && version1[j] == version2[j]) {
					System.out.println("YES");// 全けた同じ
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}