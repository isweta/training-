package day12.q3.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import day12.q3.code.ImaginaryRootsException;
import day12.q3.code.QuadraticSolver;

public class TestFindRoots {

	@Test
	public void UTC_01() {

		double[] actual = QuadraticSolver.findRoots(2, 5, 3);
		double[] expected = { -1.0, -1.5 };

		assertTrue(Arrays.equals(expected, actual));

	}

	@Test(expected = ImaginaryRootsException.class)
	public void UTC_02() {

		QuadraticSolver.findRoots(1, 2, 3);

	}
	
	@Test
	public void UTC_03() {

		double[] actual = QuadraticSolver.findRoots(3, 10, 3);
		System.out.println(actual[0]+" "+actual[1]);
		double[] expected = { (double)(-1.0/3.0), -3.0 };

		assertTrue(Arrays.equals(expected, actual));

	}
}
