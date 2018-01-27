package me.yukicoder;
import java.util.Scanner;

public class No9002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        final String f = "Fizz";
        final String b = "Buzz";
        final String fb = f+b;

        for(int i = 1; i < a + 1; i++){
        	if(i % 15 == 0){
        		System.out.println(fb);
        	}
        	else if (i % 3 == 0){
        		System.out.println(f);
        	}
        	else if (i % 5 == 0){
        		System.out.println(b);
        	}
        	else {
        		System.out.println(i);
        	}
        }
    }
}
