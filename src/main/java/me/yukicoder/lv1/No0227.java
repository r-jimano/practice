package me.yukicoder.lv1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 5枚のカードが配られます。それぞれのカードには、1以上13以下のいずれかの整数が書かれています。
 * カードに書かれている整数の組み合わせによって役が決まります。
 * 配られた5枚のカードが、以下のいずれの役に該当するかを調べてください。
 * <p>
 * 複数の役に該当する場合は、以下で先に記述した方の役に該当するものとします。 <br>
 * FULL HOUSE <br>
 * THREE CARD <br>
 * TWO PAIR <br>
 * ONE PAIR
 */
public class No0227 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> cards = new HashMap<>();

		for (int i = 0; i < 5; i++) {
			String key = sc.next();
			cards.computeIfPresent(key, (k, v) -> v + 1);
			cards.putIfAbsent(key, 1);
		}

		System.out.println(judge(cards));
	}

	static String judge(Map<String, Integer> cards) {
		boolean contains3 = cards.containsValue(3);
		boolean contains2 = cards.containsValue(2);
		if (contains3 && contains2) {
			return "FULL HOUSE";
		}
		if (contains3) {
			return "THREE CARD";
		}
		if (contains2 && cards.size() == 3) {
			return "TWO PAIR";
		}
		if (contains2 && cards.size() == 4) {
			return "ONE PAIR";
		}
		return "NO HAND";
	}
}