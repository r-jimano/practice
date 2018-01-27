package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No0632 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] str = br.readLine().split(" ");
			int[] matsu = new int[str.length];
			int hatena = 0;
			String ans = null;

			for (int i = 0; i < 3; i++) {
				if (str[i].equals("?")) {
					hatena = i;
					matsu[i] = 0;
				} else {
					matsu[i] = Integer.parseInt(str[i]);
				}
			}

			matsu[hatena] = 1;
			ans = isKadomatsu(matsu) ? "1" : "";
			matsu[hatena] = 4;
			ans = isKadomatsu(matsu) ? ans + "4" : ans;

			System.out.println(ans);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static boolean isKadomatsu(int[] matsu) {
		int[] tmp = { matsu[0], matsu[1], matsu[2] };
		Arrays.sort(tmp);
		return (tmp[1] != matsu[1]) && (matsu[0] != matsu[1] && matsu[1] != matsu[2] && matsu[0] != matsu[2]);
	}
}