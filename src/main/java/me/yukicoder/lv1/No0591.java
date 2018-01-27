package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0591 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String input = br.readLine();
			String input2 = br.readLine();

			System.out.println("(" + input + input2 + input + ")/");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
