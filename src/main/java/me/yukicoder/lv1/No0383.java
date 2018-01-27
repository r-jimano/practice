package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class No0383 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			String s = "";

			if (b - a > 0) {
				s = "+";
			}
			System.out.println(s + "" + (b - a));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}