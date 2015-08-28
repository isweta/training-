package day12.q1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import day12.q1.code.LargeFinder;

public class TestLargeFinder {

	@Test
	public void UTC_01() {
		int[] arr = { 2, 8, 3, 1, 5 };
		int expected = 8;
		int actual = LargeFinder.findlarge(arr);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		int[] arr = { 2, 8, 0, 1, 9 };
		int expected = 9;
		int actual = LargeFinder.findlarge(arr);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		int[] arr = { 12, 8, 0, 1, 9 };
		int expected = 9;
		int actual = LargeFinder.findlarge(arr);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		int[] arr = { 2, 8, 0, 1, -9 };
		int expected = 8;
		int actual = LargeFinder.findlarge(arr);
		assertEquals(expected, actual);

	}

	@Test
	public void UTC_05() {
		int[] arr = { -2, -8, -1, -9 };
		int expected = -1;
		int actual = LargeFinder.findlarge(arr);
		assertEquals(expected, actual);

	}

}
