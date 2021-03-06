package me.yukicoder.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class No0525 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] input = br.readLine().split(":");
			LocalTime time = LocalTime.of(Integer.parseInt(input[0]), Integer.parseInt(input[1]));

			System.out.println(time.plusMinutes(5));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void another(BufferedReader br) throws IOException {
		String[] input = br.readLine().split(":");
		int hour = Integer.parseInt(input[0]);
		int minute = Integer.parseInt(input[1]);

		minute += 5;
		hour = (minute > 59) ? hour + 1 : hour;

		System.out.println(String.format("%02d:%02d", hour % 24, minute % 60));
	}
}
