package me.yukicoder.lv1;
import java.util.Scanner;

public class No0128 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int M = sc.nextInt();
				
		System.out.println( (N / M) / 1000 * 1000 );
	}
}