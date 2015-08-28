import java.util.Scanner;

public class Measurements {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		double num = s.nextDouble();
		circle(num);
		square(num);
		sphere(num);

	}

	public static void sphere(double num) {
		System.out
				.println("\n\nIf a sphere is drawn with radius as the given number");
		double diag = Math.sqrt(2) * num;
		double volume = (4.0 / 3.0) * 3.14 * num * num * num;
		double sa = 4.0 * 3.14 * num * num;

		System.out.println("Volume is : " + volume);
		System.out.println("Surface Area is :" + sa);
	}

	public static void square(double num) {
		System.out
				.println("\n\nIf a square is drawn with side as the given number");
		double diag = Math.sqrt(2) * num;

		System.out.println("The diagnoal is :" + diag);
	}

	public static void circle(double num) {
		System.out
				.println("\n\nIf a circle is drawn with the radius as the given number");
		double area = (3.14) * num * num;
		double circumference = 2 * 3.14 * num;
		System.out.println("Area is :" + area);
		System.out.println("Circumference is: " + circumference);
	}

}
