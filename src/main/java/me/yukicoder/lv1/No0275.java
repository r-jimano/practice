package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * N 個の整数Aiが与えられるので、その中央値（メジアン）を求めてください。
 * 中央値（メジアン）とは、小さい順に並べたとき中央に位置する値。
 * データが偶数個の場合は、中央に近い2つの値の算術平均（いわゆる普通の平均）をとる。(Wikipediaから抜粋)
 * 小数第一位まで求めてください。
 */
public class No0275 {
	public static void main(String[] args) {
		try (BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in))) {
	        int N = Integer.parseInt(br.readLine());
	        String[] str = br.readLine().split(" ");
	        int[] A = new int[N];
	        int length = A.length;
	        int l = length / 2;
	        
	        for (int i = 0; i < N ; i++) {
	        	A[i] = Integer.parseInt(str[i]);
	        }
	        Arrays.sort(A);	        
	        
	        if(length % 2 == 0){
	        	System.out.println( (double)(A[l - 1] + A[l]) / 2);
	        } else {
	        	System.out.println(A[l]);
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}