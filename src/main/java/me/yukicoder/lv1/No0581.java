package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class No0581 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] str = br.readLine().split(" ");
			long a = Long.parseLong(str[0]);
			long c = Long.parseLong(str[1]);

			System.out.println(a ^ c);// ヒント：二進数
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
