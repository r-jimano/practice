package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * N個の数字が与えられるのでこれらをK(≥3)個のグループに振り分ける。
 * ただし各グループには最低一つ数字が含まれているとする。
 * グループごとに平均を計算し, それらをもとに 最大の平均 - 最小の平均 を計算し、
 * 最後に小数点以下を切り上げその値を「平均の差」と呼ぶ。
 * 平均の差を最も大きくするようなグループ分けをしたとき、平均の差はいくつになるか答えよ。
 * 
 * 最大値のみ、最小値のみ、残りの数字のグループにすれば、差は最も大きくなる
 */

public class No0021 {
	public static void main(String[] args) {
		try (BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in))) {
	        int N = Integer.parseInt(br.readLine());
	        //int K = Integer.parseInt(br.readLine());
	        int[] n = new int[N];
	        
	        for (int i = 0; i < N ; i++) {
	        	n[i] = Integer.parseInt(br.readLine());
	        }
	        Arrays.sort(n);
	        System.out.println(n[N-1] - n[0]);
	        
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}