package jp.co.impress.book.algorithm;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumericalCalcExampleTest {
	NumericalCalcExample calc;

	@BeforeEach
	void setUp() throws Exception {
		calc = new NumericalCalcExample();
	}

	@Test
	void testCalcPrimeNumber() {
		List<Integer> actual = calc.calcPrimeNumber(100);
		List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,
				71, 73, 79, 83, 89, 97);

		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}

	@Test
	void testCalcGreatestCommonDivisor() {
		NumericalCalcExample calc = new NumericalCalcExample();
		int actual = calc.calcGreatestCommonDivisor(221, 143);
		int expected = 13;
		assertEquals(expected, actual);
	}

}