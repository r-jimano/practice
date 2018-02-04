package me.yukicoder.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0045 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int cntDish = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			int[] v = new int[cntDish];
			int max = 0;

			for (int i = 0; i< cntDish;i++) {
				v[i] = Integer.parseInt(str[i]);
				max = Math.max(max, v[i]);
						
			}
			
			System.out.println();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
