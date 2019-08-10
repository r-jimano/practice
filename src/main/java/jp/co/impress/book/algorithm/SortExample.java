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

	}
}
