package jp.paiza.D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D010 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String local = br.readLine().trim();
		String domain = br.readLine().trim();

		System.out.println(local + "@" + domain);
	}
}
