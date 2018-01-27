package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;


public class No0552 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			BigDecimal input = new BigDecimal(br.readLine());
			System.out.println(input.multiply(BigDecimal.valueOf(10)));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void another() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String str = br.readLine();

			if (str.equals("0")) {
				System.out.println(str);
				return;
			}
			System.out.println(str + "0");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
