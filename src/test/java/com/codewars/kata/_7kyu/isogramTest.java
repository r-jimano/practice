package com.codewars.kata._7kyu;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.codewars.kata._7kyu.isogram;

class isogramTest {

	@Test
	void testisIsogram() {
		assertEquals(isogram.isIsogram("Dermatoglyphics"), true);
		assertEquals(isogram.isIsogram("isogram"), true);
		assertEquals(isogram.isIsogram("moose"), false);
		assertEquals(isogram.isIsogram("isIsogram"), false);
		assertEquals(isogram.isIsogram("aba"), false);
		assertEquals(isogram.isIsogram("moOse"), false);
		assertEquals(isogram.isIsogram("thumbscrewjapingly"), true);
		assertEquals(isogram.isIsogram(""), true);
	}

}
