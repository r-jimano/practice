package jp.co.impress.book.algorithm;

public class SearcherExample {

	int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	int binarySearch(int[] arr, int target) {
		// 探索範囲
		int begin = 0;
		int end = arr.length;

		while (begin < end) {
			int center = (begin + end) / 2;
			if (arr[center] == target) {
				return center;
			} else {
				// 検索範囲を中央の前or後ろに絞り込んで、 以下繰り返し
				if (arr[center] > target) {
					begin = center + 1;
				} else {
					end = center - 1;
				}
			}
		}
		return -1;
	}

}
