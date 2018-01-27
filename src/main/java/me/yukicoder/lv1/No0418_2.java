package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ミンミンゼミ
 */
public class No0418_2 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] str = br.readLine().split("n");
			System.out.println(str.length);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}