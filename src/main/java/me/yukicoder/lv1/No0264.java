package me.yukicoder.lv1;
import java.util.Scanner;

/*
 * 自分と相手がじゃんけんをする。
 * じゃんけんの結果を標準出力に出力してください。
 * 結果は、自分が勝ったら「Won」、自分が負けたら「Lost」、引き分けなら「Drew」を出力してください。
 * ぐー, ちょき, ぱーをそれぞれ 0, 1, 2とし、１つ目に自分のが２つ目に相手のが与えられます。
 */
public class No0264 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		byte N = sc.nextByte();
		byte K = sc.nextByte();

		//3の剰余
		if(N == K) drew();
		else if( (N + 1) % 3 == K) won();
		else lost();
	}
	
	public static void won(){
		System.out.println("Won");
	}
	public static void lost(){
		System.out.println("Lost");
	}
	public static void drew(){
		System.out.println("Drew");
	}
}