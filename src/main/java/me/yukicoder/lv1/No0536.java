package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0536 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String input = br.readLine();

			String ans = input.endsWith("ai") ? input.substring(0, input.lastIndexOf("ai")) + "AI" : input + "-AI";

			System.out.println(ans);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}