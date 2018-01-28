package jp.co.oreilly.books.algorithmic_puzzles.tutorial;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ShortestPathCountingTest {

	@Test
	void testSolveConbination() {
		ShortestPathCounting s = new ShortestPathCounting();
		int actual = s.solveConbination(4, 3);
		assertEquals(10, actual);
	}

	@Test
	void testSolveDynamic() {
		ShortestPathCounting s = new ShortestPathCounting();
		int actual = s.solveDynamic(4, 3);
		assertEquals(10, actual);
	}

}
