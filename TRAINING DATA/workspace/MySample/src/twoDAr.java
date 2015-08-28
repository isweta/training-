import java.util.Scanner;

public class twoDAr {

	public static void main(String[] args) {
		int ar[][] = new int[3][4];
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[0].length; j++) {
				System.out.println("Enter element in " + i + "th row and " + j
						+ "th col of array");
				ar[i][j] = s.nextInt();

			}

		}

		for (int i[] : ar) {

			System.out.println();
			for (int j : i) {
				System.out.print(j + "\t");
			}
		}
	}

}
