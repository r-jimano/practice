package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No0156 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] s1 = br.readLine().split(" ");
			String[] s2 = br.readLine().split(" ");
			int N = Integer.parseInt(s1[0]);
			int M = Integer.parseInt(s1[1]);			
			int[] candy = new int[N];
			int cntBox = 0;

			for (int i = 0; i < N; i++) {
				candy[i] = Integer.parseInt(s2[i]);
			}
			Arrays.sort(candy);
			for (int i = 0; i < N; i++) {
				M -= candy[i];
				if(M < 0) {
					break;
				}
				cntBox++;
			}
			System.out.println(cntBox);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}