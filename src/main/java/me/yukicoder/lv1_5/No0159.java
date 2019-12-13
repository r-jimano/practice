package me.yukicoder.lv1_5;

import java.io.IOException;
import java.util.Scanner;

public class No0159 {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double p = sc.nextDouble();// 確率pで表向き
		double q = sc.nextDouble();// 表向きの時確率qでUSBが刺さる

		double p1 = (1.0 - p) * q;// 裏→表で刺さる
		double p2 = p * (1.0 - q) * q;// 表→裏→表で刺さる
		
		System.out.println(p1 < p2 ? "YES" : "NO");
	}
}
