package me.yukicoder.wip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No0256 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split("");
		int[] arr = new int[input.length];
		
		for (int i = 0; i < input.length; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		Arrays.sort(arr);
	
		for (int i = input.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}
