import java.util.*;

public class Q4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		List<Integer> done = new ArrayList<Integer>(); // 噂を知っている人を格納するList
		Queue<Integer> notDone = new ArrayDeque<Integer>(); // 噂を知らない人を格納するQueue
		// 人口は2*nなので1～2*nでループし、初日の時点で知っている人と知らない人に振り分ける
		for (int i = 1; i <= 2 * n; i++) {
			if (i <= k) {
				// 初日の時点で既に知っている人
				done.add(i);
			}
			else {
				// 初日の時点で知らない人
				notDone.add(i);
			}
		}
		
		int days = 0; // 経過日数
		List<String> ansL = new ArrayList<String>(); // 回答出力用の文字列（1日1行）を格納するためのリスト
		// キューがなくなるまでループ
		while (!notDone.isEmpty()) {
			Map<Integer, Integer> convMap = new HashMap<Integer, Integer>(); // 会話した人の組み合わせを格納するMap
			
			List<Integer> newDone = new ArrayList<Integer>(); // 今回新たに教えてもらう人を格納するList
			List<Integer> notConvL = new ArrayList<Integer>(); // 全員が知った後なので、新たに教える人がいなくなってしまった人を格納するList
			
			// １．知っている人と知らない人の会話
			for (Integer from : done) {
				Integer to = notDone.poll(); // 今回新たに教えてもらう人
				if (to == null) {
					// 全員が知った後も、知っている人同士で会話する必要があるため会話
					notConvL.add(from);
					continue;
				}
				newDone.add(to);
				
				// 会話した人の組み合わせをMapに追加
				convMap.put(from, to);
				convMap.put(to, from);
			}
			
			// 今回新たに知った人を追加
			done.addAll(newDone);
			
			// ２．知らない人同士の会話
			List<Integer> notDoneL = new ArrayList<Integer>(notDone); // キューから減らさずにループするためにnotDoneをListに格納
			for (int i = 0; i < notDoneL.size(); i += 2) {
				int from = notDoneL.get(i);
				int to = notDoneL.get(i + 1);

				convMap.put(from, to);
				convMap.put(to, from);
			}
			
			// ３．知っている人同士の会話（全員が知ってしまったことにより新たに教える人がいなくなってしまったので、知っている人同士で会話する）
			for (int i = 0; i < notConvL.size(); i += 2) {
				int from = notConvL.get(i);
				int to = notConvL.get(i + 1);

				convMap.put(from, to);
				convMap.put(to, from);
			}
			
			// convMapをキー（人のID）順にソートして会話の文字列を出力
			StringBuilder sb = new StringBuilder();
			convMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
					.forEach(entry -> sb.append(" " + entry.getValue()));
			ansL.add(sb.subSequence(1, sb.length()).toString());
			
			// 経過日数を加算
			days++;
		}
		// 結果出力
		System.out.println(days);
		for (String ans : ansL) {
			System.out.println(ans);
		}
	}
}