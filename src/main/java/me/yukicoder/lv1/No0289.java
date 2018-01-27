package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 文字列SSが与えられるので, その中のそれぞれの数字を1桁の数値とみなして, 全ての合計値を求めてください.
 * <p>
 * 例えば1test23という文字列の数字の合計値は1+2+3=6となる.
 * <br><br>
 * 2016/05/31 追記 <br>
 * 注意: 数字がない場合は0を出力してください。
 */
public class No0289 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String s = br.readLine().trim();
			// regex number
			int sum = countByRegex(s);

			System.out.println(sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static int countByRegex(String str) {
		int sum = 0;
		String[] strArray = str.split("");
		String numRegex = "\\d";
		Pattern p = Pattern.compile(numRegex);

		for (String s : strArray) {
			if (p.matcher(s).find()) {
				sum += Integer.parseInt(s);
			}
		}
		return sum;
	}
	
	static int countByChar(String str) {
		char[] a = str.toCharArray();
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			int code = (int) a[i];
			if (47 < code && code < 58) {
				sum += Integer.parseInt(Character.toString(a[i]));
			}
		}
		return sum;
	}
	
}