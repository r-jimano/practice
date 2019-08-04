package jp.co.impress.book.algorithm.search;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SearcherExampleTest {

	SearcherExample searcher;

	@BeforeEach
	void before() {
		searcher = new SearcherExample();
	}

	@Test
	void testLinearSearch() {
		int[] arr = { 4, 2, 3, 5, 1 };
		int actual = searcher.linearSearch(arr, 5);
		int expected = 3;
		assertEquals(expected, actual);

		actual = searcher.linearSearch(arr, 1);
		expected = 4;
		assertEquals(expected, actual);

		actual = searcher.linearSearch(arr, 10);
		expected = -1;
		assertEquals(expected, actual);
	}

	@Test
	void testBinarySearch() {
		int[] arr = { 11, 13, 17, 19, 23, 29, 31 };
		Arrays.sort(arr);
		assertEquals(searcher.linearSearch(arr, 11), 0);
		int actual = arr.length - 1;
		assertEquals(searcher.linearSearch(arr, 31), actual);
		assertEquals(searcher.linearSearch(arr, 35), -1);

		int[] arr2 = { 11, 13, 17, 19, 23, 29 };
		Arrays.sort(arr);
		assertEquals(searcher.linearSearch(arr2, 11), 0);
		assertEquals(searcher.linearSearch(arr2, 29), arr2.length - 1);
		assertEquals(searcher.linearSearch(arr2, 35), -1);
	}

}
