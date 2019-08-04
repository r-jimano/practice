package jp.co.impress.book.algorithm.search;

/**
 * ハッシュ探索法の簡単な実装例です。
 * 要素の追加・削除には対応していません。
 */
public class HashSearcherExample {
	private int[] hashArray;

	void createHashArray(int[] arr) {
		// TODO ハッシュ表の要素数
		// 「n % s」というハッシュ関数の場合、ハッシュ表の要素数 s を素数にすることで、
		// 偏った結果になりにくいらしい。
		hashArray = new int[arr.length * 2];

		for (int i = 0; i < arr.length; i++) {
			int hashcode = hashCode(arr[i]);

			// どこかには格納される
			while (hashArray[hashcode] != 0) {
				hashcode = (hashcode + 1) % hashArray.length;
			}
			hashArray[hashcode] = arr[i];
		}
	}

	int hashSearch(int[] arr, int target) {
		int hashcode = target % hashArray.length;

		while (hashArray[hashcode] != 0) {
			if (hashArray[hashcode] == target) {
				return hashcode;
			}
			hashcode = (hashcode + 1) % hashArray.length;
		}
		return -1;
	}

	private int hashCode(int target) {
		return target % hashArray.length;
	}

	void deleteHashArray() {
		hashArray = null;
	}

}
