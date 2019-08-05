package jp.co.impress.book.algorithm.search;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
		fail("まだ実装されていません");
	}

	@Test
	void testQuickSort() {
		fail("まだ実装されていません");
	}

}
