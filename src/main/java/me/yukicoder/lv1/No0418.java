package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ミンミンゼミ
 */
public class No0418 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			Pattern p = Pattern.compile("(mi\\-*n)");
			Matcher m = p.matcher(br.readLine());
			String str = m.replaceAll("m");
			System.out.println(str.length());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}