package day12.q3.code;

public class QuadraticSolver {

	public static double[] findRoots(double a, double b, double c) {

		double d = (b * b) - (4 * a * c);

		if (d < 0)
			throw new ImaginaryRootsException();
		double dsqrt=Math.sqrt(d);
		double root1 = ((-b) + dsqrt) / (2 * a);
		double root2 = ((-b) - dsqrt) / (2 * a);

		double[] roots = new double[2];
		roots[0] = root1;
		roots[1] = root2;
		return roots;

	}

}
