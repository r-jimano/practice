package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * NOT回路とは「０が入力されれば１を、１が入力されれば０を出力」する回路のことだ。
 * NOT回路の動作をするプログラムを書いてみよう。
 */
public class No0272 {
	public static void main(String[] args) {
		try (BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in))) {
	        int N = Integer.parseInt(br.readLine());
	        
	        if(N == 0) System.out.println(1);
	        else System.out.println(0);
	        
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}