package me.yukicoder.lv1;

import java.util.Scanner;

/**
 * ユキコダ国のテレビ画面は「縦の長さ:横の長さ」の比率が「4:3」の縦型と「3:4」の横型の2種類がある。
 * あるユキコダ国のテレビ画面の縦の長さ、横の長さが整数で与えられる。
 * 縦型であれば"TATE"、横型であれば"YOKO"と判定せよ。
 * <br>
 * 比率「H:W」が「4:3」と「3:4」以外の入力は与えられない。
 */

public class No0427 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			
			System.out.println( (H > W) ? "TATE" : "YOKO");
		}
	}
}