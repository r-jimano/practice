package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0400 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			char[] array = br.readLine().toCharArray();
			int length = array.length;
			char tmp;

			// change
			for (int i = 0; i < length / 2; i++) {
				int idx = length - 1 - i;
				tmp = array[i];
				array[i] = array[idx];
				array[idx] = tmp;
			}
			// reverse
			for (int i = 0; i < length; i++) {
				array[i] = (array[i] == '>') ? '<' : '>';
			}

			System.out.println(array);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}