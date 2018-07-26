package com.codewars.kata._8kyu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.codewars.kata._8kyu.Kata;

class KataTest {

	@Test
	public void countPositivesSumNegatives_BasicTest() {
		int[] expectedResult = new int[] { 10, -65 };
		assertArrayEquals(expectedResult,
				Kata.countPositivesSumNegatives(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15 }));
	}

	@Test
	public void countPositivesSumNegatives_InputWithZeroes() {
		int[] expectedResult = new int[] { 8, -50 };
		assertArrayEquals(expectedResult,
				Kata.countPositivesSumNegatives(new int[] { 0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14 }));
	}

	@Test
	public void tests() {
		assertArrayEquals(new int[] { 1, 3, 2, 5, 3 }, Kata.digitize(35231));
	}
}
