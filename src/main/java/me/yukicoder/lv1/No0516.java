package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0516 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int cntRed = 0;
			int cntBlue = 0;
			for (int i = 0; i < 3; i++) {
				if (br.readLine().equals("BLUE")) {
					cntBlue++;
				} else {
					cntRed++;
				}
			}
			System.out.println(cntRed < cntBlue ? "BLUE" : "RED");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}