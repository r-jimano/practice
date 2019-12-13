package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class No0135 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int N = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			int[] x = new int[N];
			int min = 0;// Integer.MAX_VALUEとかにして状態を持つようにしてやるとよい？
			//int tmp = 0;
			boolean boo = false;

			for (int i = 0; i < N; i++) {
				x[i] = Integer.parseInt(str[i]);
			}
			Arrays.sort(x);// Stackoverflow...

			for (int i = 0; i < N - 1; i++) {
				int abs = Math.abs(x[i] - x[i + 1]);
				if (abs != 0) {
					if (!boo) {
						boo = true;
						min = abs;
					}
					min = Math.min(min, abs);
				}
			}
			System.out.println(min);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}