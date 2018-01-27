package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class No0345 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			char[] array = br.readLine().toCharArray();
			int ans = Integer.MAX_VALUE;

			// c w wを愚直に探すしかないかな・・・
			for (int i = 0; i < array.length; i++) {
				if (array[i] == 'c') {
					int count = 0;
					for (int j = i; j < array.length; j++) {
						if (array[j] == 'w') {
							count++;
						}
						if (count == 2)
							ans = Math.min(ans, j - i + 1);
					}
				}
			}
			System.out.println(ans != Integer.MAX_VALUE ? ans : -1);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}