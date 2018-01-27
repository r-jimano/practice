package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0530 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int Y = Integer.parseInt(br.readLine());
			System.out.println(2017 - Y);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}