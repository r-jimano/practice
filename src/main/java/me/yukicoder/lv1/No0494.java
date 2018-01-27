package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class No0494 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			char[] input = br.readLine().toCharArray();
			char[] correct = "yukicoder".toCharArray();

			for (int i = 0; i < input.length; i++) {
				if (input[i] != correct[i]) {
					System.out.println(correct[i]);
					return;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
