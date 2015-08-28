import java.util.Scanner;

public class Mat {

	public static void main(String[] args) {
		int ar[][] = new int[10][10];
		Scanner s = new Scanner(System.in);

		ar[0][1] = 1;
		System.out.println("\nOriginal array");
		display(ar);
		init(ar);
		System.out.println("\nInitialised Array");
		display(ar);
		System.out.println("");

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[0].length; j++) {
				System.out.println("\nEnter element in " + i + "th row and " + j
						+ "th col of array");
				ar[i][j] = s.nextInt();

			}

		}
		System.out.println("\nOriginal array");
		display(ar);
		int[][] tar=transpose(ar);
		System.out.println("\nTransposed array");
		display(tar);

	}
	public static int[][] transpose(int [][] ar){
		int r=ar.length;
		int c=ar[0].length;
		int [][] temp=new int[r][c];
		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[0].length; j++) {
				temp[j][i] =ar[i][j];
			}
		}
		
		return temp;
		
		
	}
	
	public static void init(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[0].length; j++) {
				ar[i][j] = 0;
			}
		}
	}

	public static void display(int[][] ar) {
		for (int i[] : ar) {

			System.out.println();
			for (int j : i) {
				System.out.print(j + "\t");
			}
		}

	}

}
