package me.yukicoder.lv1_5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class No0201 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputA = br.readLine().split(" ");
		String[] inputB = br.readLine().split(" ");
		BigInteger a = new BigInteger(inputA[1]);
		BigInteger b = new BigInteger(inputB[1]);

		if (a.compareTo(b) > 0) {
			System.out.println(inputA[0]);
		} else if (a.compareTo(b) < 0) {
			System.out.println(inputB[0]);
		} else {
			System.out.println(-1);
		}
	}
}