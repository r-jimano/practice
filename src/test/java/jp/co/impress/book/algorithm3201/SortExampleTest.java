package jp.co.impress.book.algorithm3201;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jp.co.impress.book.algorithm3201.SortExample;

class SortExampleTest {
	SortExample sorter;
	
	@BeforeEach
	void setUp() throws Exception {
		sorter = new SortExample();
	}

	@Test
	void testSelectionSort() {
		int[] actual = { 12, 13, 11, 14, 10 };
		int[] expected = { 10, 11, 12, 13, 14 };
		sorter.selectionSort(actual);

		assertArrayEquals(expected, actual);
	}

	@Test
	void testBubbleSort() {
		int[] actual = { 12, 13, 11, 14, 10 };
		int[] expected = { 10, 11, 12, 13, 14 };
		sorter.bubbleSort(actual);

		assertArrayEquals(expected, actual);
	}

	@Test
	void testInsertionSort() {
		int[] actual = { 12, 13, 11, 14, 10 };
		int[] expected = { 10, 11, 12, 13, 14 };
		sorter.insertionSort(actual);

		assertArrayEquals(expected, actual);
	}

	@Test
	void testQuickSort() {
		int[] actual = { 5, 4, 7, 6, 8, 3, 1, 2, 9 };
		int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		sorter.quickSort(actual);

		assertArrayEquals(expected, actual);
	}

}
