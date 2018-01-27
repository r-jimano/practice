package me.yukicoder.lv1;
import java.util.Scanner;

public class No56 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 1;
		int result = 0;
		
		while(cnt < N){
			cnt = cnt * 2;
			result++;
		}
		System.out.println(result);
	}
}