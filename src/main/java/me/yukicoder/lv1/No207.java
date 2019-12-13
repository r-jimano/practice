package me.yukicoder.lv1;
import java.util.Scanner;

public class No207 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		final long a = sc.nextLong();
		final long b = sc.nextLong();
		
		for(long i = a; i <= b; i++){
			if(isNabe(i)) System.out.println(i);
		}
	}
	
	static boolean isNabe(long i){
		return i % 3 == 0 || Long.toString(i).indexOf("3") >= 0;
	}
}