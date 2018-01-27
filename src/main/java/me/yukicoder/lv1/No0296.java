package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;


public class No0296 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			String[] str = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int h = Integer.parseInt(str[1]);
			int m = Integer.parseInt(str[2]);
			int t = Integer.parseInt(str[3]);

			LocalTime time = LocalTime.of(h, m).plusMinutes((n - 1) * t);

			System.out.println(time.getHour());
			System.out.println(time.getMinute());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}