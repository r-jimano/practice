package me.yukicoder.lv1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0354 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// メルセンヌ素数2^p-1の二進表記は1がp回並ぶ
		System.out.println(Integer.parseInt(br.readLine()));
	}
}
