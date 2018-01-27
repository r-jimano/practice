package me.yukicoder.wip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No0586_2 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int yukiPrice = Integer.parseInt(br.readLine());
			int furikaePrice = Integer.parseInt(br.readLine());
			int cntReserve = Integer.parseInt(br.readLine());
			int cntDupulicate = 0;
			int[] reserve = new int[cntReserve];

			for (int i = 0; i < reserve.length; i++) {
				reserve[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(reserve);

			for (int i = 0; i < reserve.length - 1; i++) {
				cntDupulicate = (reserve[i] == reserve[i + 1]) ? cntDupulicate + 1
						: cntDupulicate;
			}
			System.out.println((yukiPrice + furikaePrice) * cntDupulicate);

		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}