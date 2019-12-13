package me.yukicoder.lv1;
import java.util.Scanner;

public class No163 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		char[] pass = sc.next().toCharArray();
		StringBuffer sb = new StringBuffer();

		for(char c : pass){
			if(Character.isLowerCase(c)){
				sb.append(Character.toUpperCase(c));
			}else if(Character.isUpperCase(c)){
				sb.append(Character.toLowerCase(c));
			}
		}
		System.out.println(sb);
	}
}