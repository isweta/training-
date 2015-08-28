package day12.q2.code;

import java.util.Arrays;
import java.util.Scanner;

public class MedianFinder {

	public static void getValues(String[] args) {
		int l = args.length;
		int arOrg[] = new int[l];

		for (int i = 0; i < l; i++) {
			arOrg[i] = Integer.parseInt(args[i]);
		}
		int arNew[] = null;
		arNew = copyRotate(arOrg);
		int median = findMedian(arNew);
		

	}

	public static int findMedian(int[] ar) {
		int l = ar.length;
		if (l % 2 == 0) {
			int val1 = ar[(l / 2) - 1];
			int val2 = ar[l / 2];
			int mean = (val1 + val2) / 2;
			return mean;
		}
		return ar[((l + 1) / 2) - 1];
	}

	public static int[] copyRotate(int[] ar) {
		int l = ar.length;
		int arNew[] = new int[l];
		for (int i = 0; i < l; i++) {
			int nexti = (i + 1) % l;
			arNew[nexti] = ar[i];
		}
		return arNew;
	}

}
