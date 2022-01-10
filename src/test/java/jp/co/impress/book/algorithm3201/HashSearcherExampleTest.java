package jp.co.impress.book.algorithm3201;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jp.co.impress.book.algorithm3201.HashSearcherExample;

//import jp.co.impress.book.algorithm.HashSearcherExample;

class HashSearcherExampleTest {
	HashSearcherExample searcher;

	@BeforeEach
	void setUp() {
		searcher = new HashSearcherExample();
	}

	@Test
	void testHashSearch() {
		int[] arr = {12,25,36,20,30,8,42};
		searcher.createHashArray(arr);

		int actual = searcher.hashSearch(arr, 20);
		assertTrue(actual != -1 , "見つかりませんでした");
		actual = searcher.hashSearch(arr, 1);
		assertTrue(actual == -1 , "いないはず");
	}

}
