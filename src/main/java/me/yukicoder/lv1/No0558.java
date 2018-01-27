package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No0558 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println(br.readLine().indexOf("575") != -1 ? "YES" : "NO");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
