package jp.co.impress.book.algorithm;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jp.co.impress.book.algorithm.SortExample;

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

		for (int i = 0; i < actual.length; i++) {
			assertEquals(actual[i], expected[i]);
		}
	}

	@Test
	void testBubbleSort() {
		int[] actual = { 12, 13, 11, 14, 10 };
		int[] expected = { 10, 11, 12, 13, 14 };
		sorter.bubbleSort(actual);

		for (int i = 0; i < actual.length; i++) {
			assertEquals(actual[i], expected[i]);
		}
	}

	@Test
	void testInsertionSort() {
		int[] actual = { 12, 13, 11, 14, 10 };
		int[] expected = { 10, 11, 12, 13, 14 };
		sorter.insertionSort(actual);

		for (int i = 0; i < actual.length; i++) {
			assertEquals(actual[i], expected[i]);
		}
	}

	@Test
	void testQuickSort() {
		int[] actual = { 5, 4, 7, 6, 8, 3, 1, 2, 9 };
		int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		sorter.quickSort(actual);

		for (int i = 0; i < actual.length; i++) {
			assertEquals(actual[i], expected[i]);
		}
	}

}
