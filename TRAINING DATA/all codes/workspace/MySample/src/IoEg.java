import java.util.Scanner;

public class IoEg {

	public static void main(String[] args) {
		int ar[] = new int[4];
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < ar.length; i++) {

			System.out.println("Enter " + i + "th element of array");
			ar[i] = s.nextInt();

		}

		for (int i : ar) {
			System.out.println(i);
		}
	}

}
