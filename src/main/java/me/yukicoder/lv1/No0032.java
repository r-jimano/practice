package me.yukicoder.lv1;
import java.util.Scanner;

public class No0032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		if(n / 25 != 0){
			m = m + (n / 25);
			n = n % 25;
		}
		if(m / 4 != 0){
			l = l + (m / 4);
			m = m % 4;
		}
		if(l / 10 != 0){
			l = l % 10;
		}
		
		System.out.println(l + m + n);
	}	
}