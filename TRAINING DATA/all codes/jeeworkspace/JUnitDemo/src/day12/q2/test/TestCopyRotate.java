package day12.q2.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import day12.q2.code.MedianFinder;

public class TestCopyRotate {

	@Test
	public void UTC_01() {
		int arOrg[] = { 2, 6, 4, 8 };
		int expected[] = { 8, 2, 6, 4 };
		int actual[] = MedianFinder.copyRotate(arOrg);
		assertTrue(Arrays.equals(expected, actual));
	}

	@Test
	public void UTC_02() {
		int arOrg[] = { 2, 6, 4, 8, 1 };
		int expected[] = { 1, 2, 6, 4, 8 };
		int actual[] = MedianFinder.copyRotate(arOrg);
		assertTrue(Arrays.equals(expected, actual));
	}
}
