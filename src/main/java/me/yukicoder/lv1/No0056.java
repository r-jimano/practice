package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ある国の通貨単位は「ユキコダ」である。 いまからDユキコダの品物を買おうとしている
 * しかし、品物の金額に対して消費税率P%の消費税が加算される。
 * <p>
 * 実際に支払う金額はいくらか？ただし、小数点以下は切り捨てします。
 */

public class No0056 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] str = br.readLine().split(" ");
			int d = Integer.parseInt(str[0]);
			double p = (double) Integer.parseInt(str[1]) / 100;
			int price = (int) (d + (d * p));// ここで切り捨てられちゃう・・・
			System.out.println(price);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}