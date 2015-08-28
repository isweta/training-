package day12.q1.code;

public class LargeFinder {

	public static int findlarge(int arr[]) {

		int lar = Integer.MIN_VALUE;

		for (int i = 1; i < arr.length; i++) {

			if (lar < arr[i])

				lar = arr[i];

		}

		return lar;

	}

}
