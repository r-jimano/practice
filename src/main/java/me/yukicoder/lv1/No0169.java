package me.yukicoder.lv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * コピーに時間がかかるので、しばらくして確認すると「K%完了しました。あとS分かかります。」
 * と表示されていました。
 * あなたは、ゆきこちゃんの代わりに全体の処理時間(分)を計算してあげてください。
 * 答えは、小数部分の切り捨てをし、整数部分のみを答えてください。
 * 時間あたりのコピーの速さは、一定であると仮定する。
 * 
 * ゆきこちゃんの見た完了のパーセンテージは小数も表示されるが、ちょうど整数になっていたタイミングであると仮定して良い。
 * 
 * %あたりの時間　型ではまった・・・
 */

public class No0169 {
	public static void main(String[] args) {
		try (BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in))) {
	        int K = Integer.parseInt(br.readLine());
	        int S = Integer.parseInt(br.readLine());
	        // %あたりの時間
	        System.out.println(S * 100 / (100 - K));        
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}