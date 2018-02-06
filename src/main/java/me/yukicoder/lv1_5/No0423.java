package me.yukicoder.lv1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0423 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String input = br.readLine();
			
			System.out.println(input.equals("ham") ? input : input + "ham");// 二進数の二倍。0のときだけ注意
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}