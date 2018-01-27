package me.yukicoder.lv2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * ある国の通貨単位は「ユキコダ」である。いまからDユキコダの品物を買おうとしている。
 * しかし、品物の金額に対して消費税率8%の消費税が加算される。
 * 消費税加算後の金額はいくらか？小数点以下も誤差なく正確に計算すること。
 * 数値があっていれば、余計な小数桁が含まれていてもよい。
 * 丸め誤差に注意してください。
 */
public class No0285 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigDecimal price = new BigDecimal(br.readLine());
		BigDecimal tax = new BigDecimal("1.08");

		System.out.println(price.multiply(tax));
	}
}