package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0543 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] input = br.readLine().split(" ");
			System.out.println(input[1] + " " + input[0]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}