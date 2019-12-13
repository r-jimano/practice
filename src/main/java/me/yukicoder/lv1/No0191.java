package me.yukicoder.lv1;
import java.util.Scanner;

public class No0191 {
	final static int DEPOSIT = 30;
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] C = new int[N];
		int vote = 0;
		int sum = 0;
		
		for(int i = 0; i < N; i++){
			C[i] = sc.nextInt();
			vote += C[i];
		}
		
		for(int c : C){
			if (c <= (vote / 10)){
				sum += DEPOSIT;
			}
		}
		System.out.println(sum);
		
	}
}