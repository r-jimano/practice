package me.yukicoder.lv1;
import java.util.Scanner;

public class No239 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int f = sc.nextInt();
		int[] age = new int[f];
		int i = 0, j = 0;

		while(sc.hasNext()){
			age[i] = sc.nextInt();
			i++;
		}

		for(int a : age) j += a;

		System.out.println( (k * n > j) ? k * n - j : -1 );
	}
}
