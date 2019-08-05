package jp.co.impress.book.algorithm.search;

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

	}

	void quickSort(int[] arr) {

	}
}
