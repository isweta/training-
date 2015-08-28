import java.util.Scanner;

public class ArEg {

	public static void main(String[] args) {
		int ar[] = new int[10];
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < ar.length; i++) {

			System.out.println("Enter " + i + "th element of array");
			ar[i] = s.nextInt();

		}
		int sum=0;
		int max=ar[0];
		int min=ar[0];
		for (int i : ar) {
			sum+=i;
			if(i>max)
				max=i;
			if(i<min)
				min=i;
			
		}
		System.out.println("The average value of the array elements is: "+ sum/10);
		System.out.println("The min value in the array is: "+ min);
		System.out.println("The max value in the array is: "+ max);
	}

}
