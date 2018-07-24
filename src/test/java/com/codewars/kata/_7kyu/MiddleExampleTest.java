package com.codewars.kata._7kyu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MiddleExampleTest {

	@Test
	public void evenTests() {
		assertEquals("es", MiddleExample.getMiddle("test"));
		assertEquals("dd", MiddleExample.getMiddle("middle"));
	}

	@Test
	public void oddTests() {
		assertEquals("t", MiddleExample.getMiddle("testing"));
		assertEquals("A", MiddleExample.getMiddle("A"));
	}

}
