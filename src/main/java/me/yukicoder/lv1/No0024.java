package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * 太郎君と二郎君はゲームをしています。
 * まず最初に二郎君は 0から9までの数字を11つ、心の中で思い浮かべます。
 * 太郎君は、重複しないような0から9までの数字から 4つ 二郎君に提示し、
 * 二郎君は心の中で思い浮かべた数字が、提示された4つの数字の中にあれば YES 、
 * 無ければ NO と答えます。これを1ターンとし、次のターンにまた太郎君は4つの数字を提示することを繰り返します。
 * 前に出した数字と同じ数字を提示しても構いません。
 * 入力に太郎君が提示した数字と、二郎君の答えが与えられるので、
 * 二郎君が思い浮かべたであろう数字を出力してください。
 * 必ず出力する数字が1つと確定できるような入力が与えられます。
 */
public class No0024 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int cntTurn = Integer.parseInt(br.readLine());
			String[] str;
			int collectCnt = 0;
			int[] num = new int[10];

			for (int i = 0; i < cntTurn; i++) {
				str = br.readLine().trim().split(" ");
				if (str[str.length - 1].endsWith("NO")) {
					for (int j = 0; j < str.length - 1; j++) {
						num[Integer.parseInt(str[j])] = -1;// リセット
					}
				} else if (str[str.length - 1].endsWith("YES")) {
					for (int j = 0; j < str.length - 1; j++) {
						num[Integer.parseInt(str[j])] += 1;
					}
					collectCnt++;
				}
			}
			for (int i = 0; i < num.length; i++) {
				if (num[i] == collectCnt) {
					System.out.println(i);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}