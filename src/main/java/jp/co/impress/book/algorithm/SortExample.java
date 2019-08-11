package jp.co.impress.book.algorithm;

public class SortExample {

	void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int indexMin = i;
			// select minimum
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[indexMin] > arr[j]) {
					indexMin = j;
				}
			}

			int tmp = arr[i];
			arr[i] = arr[indexMin];
			arr[indexMin] = tmp;
		}
	}

	void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int tmp = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	void insertionSort(int[] arr) {
		// 最初の要素は固定、ここを基準にしてそれ以降の要素を入れ替える
		for (int i = 1; i < arr.length; i++) {
			int tmp = arr[i];// 入れ替える要素を避けておいて
			int k = i;

			// 挿入する場所を探しつつ、要素を大きいほうに詰める
			while (k > 0 && arr[k - 1] > tmp) {
				arr[k] = arr[k - 1];
				k--;
			}
			arr[k] = tmp;
		}
	}

	void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	private void quickSort(int[] arr, int left, int right) {
		int i = left + 1;
		int k = right;

		// TODO とりあえずソート対象の始めの要素を先頭にした
		// arr[leftIdx]を基準値として、
		while (i < k) {
			// 基準値より小さいもの左から、
			while (arr[i] < arr[left] && i < right) {
				i++;
			}
			// 大きいものを右から探す
			while (arr[k] >= arr[left] && k > left) {
				k--;
			}
			if (i < k) {
				int tmp = arr[i];
				arr[i] = arr[k];
				arr[k] = tmp;
			}
		}
		// 基準値を真ん中に持ってくる
		int tmp = arr[left];
		arr[left] = arr[k];
		arr[k] = tmp;

		// ここまでで、基準値を境に大きい集合と小さい集合に分けられている。
		// これらの部分集合に対して再帰的に処理する。
		if (left < k - 1) {
			quickSort(arr, left, k - 1);
		}
		if (k + 1 < right) {
			quickSort(arr, k + 1, right);
		}

	}

}
