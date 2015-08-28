import java.util.Scanner;
import java.util.*;

public class Max3 {

	public static void main(String[] args) {
		System.out.println("Enter three numbers");
		Scanner s = new Scanner(System.in);
		int a[] = new int[3];
		a[0] = s.nextInt();
		a[1] = s.nextInt();
		a[2] = s.nextInt();
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int i : a) {
			if (i > max) {
				max2 = max;
				max = i;
			} else if (i > max2) {
				max2 = i;
			}
		}

		System.out.println("2nd largest is :" + max2);

	}

}
