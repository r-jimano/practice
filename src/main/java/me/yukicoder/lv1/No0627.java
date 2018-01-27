package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No0627 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int T = Integer.parseInt(br.readLine());
			int[] x = new int[T + 1];
			x[0] = 0;
			
			for (int i = 1; i < T + 1; i++) {
				x[i] = Integer.parseInt(br.readLine());
			}
			for (int i = 0; i < T; i++) {
				if (Math.abs(x[i] - x[i + 1]) != 1) {
					System.out.println("F");
					return;
				}
			}
			System.out.println("T");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}