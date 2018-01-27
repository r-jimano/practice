package me.yukicoder.lv1_5;
import java.util.Scanner;

/**
 * 6面の普通のダイスのN個のサイコロがあります。全部振って出る目の合計の期待値を求めよ。
 * 
 * 普通のサイコロの期待値*Nでいいよね
 */

public class No0057 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long d = sc.nextLong();
			System.out.println(d * 3.5);
		}
	}
}