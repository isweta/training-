package day12.q2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import day12.q2.code.MedianFinder;

public class TestFindMedian {

	@Test
	public void UTC_01() {

		int ar[] = { 2, 7, 3, 4 };
		int expected = 5;
		int actual = MedianFinder.findMedian(ar);
		assertEquals(expected, actual);

	}

	@Test
	public void UTC_02() {

		int ar[] = { 2, 7, 3, 4, 9 };
		int expected = 3;
		int actual = MedianFinder.findMedian(ar);
		assertEquals(expected, actual);

	}

}
