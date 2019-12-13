package me.yukicoder.lv1;
import java.util.Scanner;

public class No0046 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println((b % a == 0) ? b / a : (b / a) + 1);
	}
}